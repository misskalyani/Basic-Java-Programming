import java.util.*;
class InvalidDateException extends Exception
{
	public String toString()
	{
		return "Invalid Date Exception";
	}
}
class MyDate
{
	int dd,mm,yyyy;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter dd mm yyyy");
			dd=sc.nextInt();
			mm=sc.nextInt();
			yyyy=sc.nextInt();
	}
	void disp()
	{
	  try
		{
		
			  if((mm!=4 ||mm!=6 || mm!=9  || mm!=11 ) && (dd>=31))
			  {
			       throw new InvalidDateException();
			  }
			  if((mm!=1 ||mm!=3 || mm!=5  || mm!=7  || mm!=8   || mm!=10  || mm!=12) && (dd>=30) )
			  {
			       throw new InvalidDateException();
			  }
			  if((mm!=2 ) && (dd>=28))
			  {
			       throw new InvalidDateException();
			  }
			  	System.out.println(dd+"/"+mm+"/"+yyyy);
		}
		
				catch(Exception e)
			{
			    System.out.println("Error = " +e);
			}
		
		
	}
}
class demo
{
	public static void main(String arg[])
	{
			MyDate ob=new MyDate();
			ob.accept();
			ob.disp();
			
	}
}
