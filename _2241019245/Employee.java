package _2241019245;
import java.util.*;
public class Employee
{
	public String name, jobPosition, contactNumber;
	public int empId;
	public double salary;
	int k;
	Date hireDate=new Date();
	Address address=new Address();
	public Employee()
	{
		name="";
		jobPosition="";
		contactNumber="";
		empId=0;
		salary=0.0d;
		k=1;
	}
	public void setData()throws InputMismatchException
	{
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter name, Job Position, Contact Number, Employee ID & Salary");
		name=sc3.nextLine();
		jobPosition=sc3.nextLine();
		contactNumber=sc3.nextLine();
		empId=sc3.nextInt();
		salary=sc3.nextDouble();
		//Calls other classes to take inputs of Date & Address of the Employee
		hireDate.setDate();
		address.setAddress();
	}
	public void getData()
	{
		System.out.printf("SL%9sName%7sJob%8sContact%6sE.ID%7sSalary%5sDay%8sMonth%6sYear%7sCountry%4sState%6sCity%7sLane","","","","","","","","","","","","");
		System.out.println();
		Employee.printspace(String.valueOf(k++),0);
		Employee.printspace(name,0);
		Employee.printspace(jobPosition,0);
		Employee.printspace(contactNumber,1);
		Employee.printspace(String.valueOf(empId),0);
		Employee.printspace(String.valueOf(salary),0);
		Employee.printspace(String.valueOf(hireDate.day),0);
		Employee.printspace(String.valueOf(hireDate.month),0);
		Employee.printspace(String.valueOf(hireDate.year),0);
		Employee.printspace(address.country,0);
		Employee.printspace(address.state,0);
		Employee.printspace(address.city,0);
		Employee.printspace(address.lane,0);
	}
	/*The following method prints spaces according to the String provided.
	 * The length of the concatenation of the String and the spaces must be = 11.
	 * Only case where the length must be=13, is the contact number, because contact number
	 * consists of 12 numbers (2 for country code + 10 for number) so 13 is the ideal spacing.
	 */
	public static void printspace(String ref,int z)
	{
		int control=0;
		if(z!=1)
			control=11;
		else
			control=13;
		for(int i=ref.length();i<control;i++)
		{
			if(i==ref.length())
				System.out.print(ref+" ");
			else
				System.out.print(" ");
		}
	}
}
