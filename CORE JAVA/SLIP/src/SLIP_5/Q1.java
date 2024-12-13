package SLIP_5;
import java.util.*;
//Q1) Write a program for multilevel inheritance such that Country is inherited from Continent.
//State is inherited from Country. Display the place, State, Country and Continent.
class Continent
{
	String continent;
	Scanner sc=new Scanner(System.in);
	Continent()
	{
		System.out.println("Enter Continent");
		continent=sc.next();
	}
}
class Country extends Continent
{
	String country;
	Scanner sc=new Scanner(System.in);
	Country()
	{
		System.out.println("Enter Country");
		country=sc.next();
	}
}
class State extends Country
{
	String state,place;
	Scanner sc=new Scanner(System.in);
	State()
	{
		System.out.println("Enter State");
		state=sc.next();
		System.out.println("Enter Place");
		place=sc.next();
	}
	void disp()
	{
		System.out.println("Continent\t\tCountry\t\tState\t\tPlace");
		System.out.println(continent+"\t\t"+country+"\t\t"+state+"\t\t"+place);
	}
}
public class Q1 
{

	public static void main(String[] args) 
	{
		State ob=new State();
		ob.disp();

	}

}
/*OUTPUT:
icked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
Enter Continent
Asia
Enter Country
India
Enter State
Maharashtra
Enter Place
Shrirampur
Continent	Country	State	    Place
Asia	     India	Maharashtra	Shrirampur
*/