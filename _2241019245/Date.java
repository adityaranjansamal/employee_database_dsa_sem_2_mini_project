package _2241019245;
import java.util.*;
public class Date 
{
	public int day, month, year;
	public Date()
	{
		day=0;
		month=0;
		year=0;
	}
	public void setDate()throws InputMismatchException
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the day, month & year of joining");
		day=sc1.nextInt();
		month=sc1.nextInt();
		year=sc1.nextInt();
	}
}
