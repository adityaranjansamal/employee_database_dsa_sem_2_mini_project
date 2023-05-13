package _2241019245;
import java.util.*;
public class Address 
{
	public String country, state, city, lane;
	public Address()
	{
		country="";
		state="";
		city="";
		lane="";
	}
	public void setAddress()throws InputMismatchException
	{
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter the country, state, city, lane of the Employee");
		country=sc2.nextLine();
		state=sc2.nextLine();
		city=sc2.nextLine();
		lane=sc2.nextLine();
	}
	
}
