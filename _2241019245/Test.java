package _2241019245;
/*
 * Author: Aditya Ranjan Samal
 * Regd no: 2241019245
 * Section: 2241041
 * Branch: B-Tech [CSE]
 * Font used: Inconsolata 14
 * IDE: Eclipse 4.27.0
 * OS Used: Windows 11 22H2 
 */
import java.util.*;
public class Test {

	public static void main(String[] args) 
	{
		Employee emp[]=new Employee[3];
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=new Employee();
			System.out.println("Enter Employee "+(i+1)+" details");
			emp[i].setData();
		}
		Test.arrangeEmployeeBySalary(emp);//calling method 1
		Test.getEmployeesByJobPosition(emp, "manager");//calling method 2
		//creating Date d1 object to be used in 3rd method
		Date d1=new Date();
		d1.month=4;
		d1.year=2022;
		//creating Date d2 object to be used in 3rd method
		Date d2=new Date();
		d2.month=3;
		d2.year=2023;
		Test.getEmployeesByHireDate(emp, d1, d2);//calling method 3
		System.out.println();
		System.out.println("Number of foreign employees are:"+Test.foreignEmployeeCount(emp));//calling method 4
		System.out.println();
		Test.getEmployeesBySalary(emp, 1_50_000.0, 3_00_000.0);//calling method 5
	}
	public static void arrangeEmployeeBySalary(Employee e[])//Method 1
	{
		Employee temp=new Employee();
		for(int i=0;i<e.length;i++)
		{
			for(int j=i+1;j<e.length;j++)
			{
				if(e[i].salary<e[j].salary)
				{
					temp=e[i];
					e[i]=e[j];
					e[j]=temp;
				}
				
			}
		}
	}
	public static void getEmployeesByJobPosition(Employee e[], String jp)//Method 2
	{
		System.out.println();
		System.out.println("The details of Employees who have job position as manager are listed below:");
		for(int i=0;i<e.length;i++)
		{
			if(e[i].jobPosition.equalsIgnoreCase(jp))
			{
				e[i].getData();
			}
		}
	}
	public static void getEmployeesByHireDate(Employee e[], Date d1, Date d2)//Method 3
	{
		System.out.println();
		System.out.println("Details of employees whose hireDate is between 01-04-2022 to 31-03-2023 are listed below:");
		for(int i=0;i<e.length;i++)
		{
			if(e[i].hireDate.year==d1.year)
			{
				if(e[i].hireDate.month>=4)
				{
					e[i].getData();
				}
			}
			if(e[i].hireDate.year==d2.year)
			{
				if(e[i].hireDate.month<=d2.month)
				{
					e[i].getData();
				}
			}
		}
		
	}
	public static int foreignEmployeeCount(Employee e[])//Method 4
	{
		int count=0;
		for(int i=0;i<e.length;i++)
		{
			if(e[i].contactNumber.substring(0, 2).equalsIgnoreCase("91"))
				continue;
			else
				count++;
		}
		return count;
	}
	public static void getEmployeesBySalary(Employee e[], double s1, double s2)//Method 5
	{
		System.out.println("The details of employees whose salary is in a range 150000 INR to 300000 INR are listed below:");
		for(int i=0;i<e.length;i++)
		{
			if(e[i].salary>=s1 && e[i].salary<=s2)
			{
				e[i].getData();
			}
		}
	}

}
