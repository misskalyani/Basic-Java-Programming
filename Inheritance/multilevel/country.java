import java.util.*;
class continent
{ 
  String continent,state,place,country;
  Scanner sc=new Scanner(System.in);
	void acceptcontinent()
	{
		System.out.println("Enter Continent Name");
		continent=sc.next();
	}	
}
class country extends continent
{ 
	void acceptcountry()
	{
		System.out.println("Enter Country Name");
	   country=sc.next();
	}	
}
class state extends country
{ 
	void acceptstate()
	{
		System.out.println("Enter State Name");
		state=sc.next();
		System.out.println("Enter Place Name");
		place=sc.next();
	}
	void disp()
	{
		System.out.println("Continent ="+continent);
		System.out.println("Country ="+country);
		System.out.println("State ="+state);
		System.out.println("Place ="+place);
	}
}
class Mdemo
{
  public static void main(String arg[])
  {
	  state ob=new state();
	  ob.acceptcontinent();
	  ob.acceptcountry();
	  ob.acceptstate();
	  ob.disp();
	}  
}
