package SLIP21;
//Q1) Define a class MyDate(Day, Month, year) with methods to accept and display a MyDateobject.
//Accept date as dd,mm,yyyy. Throw user defined exception "InvalidDateException" if the date is invalid.
 import java.util.*;
 import java.io.*;
 
class InvalidDate extends Exception
 {
	 public String toString()
	 {
		 return"InvalidDateException";
	 }
 }
class MyDate
 {
	Scanner sc=new Scanner(System.in);
	 int dd,mm,yy;
	 void accept()
	 {
		 
		 System.out.println("Enter Date DD MM YYYY = ");
			yy=sc.nextInt();
			mm=sc.nextInt();
			 yy=sc.nextInt(); 
	 }
	 void disp()
	 {
		 System.out.println(dd+mm+yy);
	 }
 }
public class Q1 
{

	public static void main(String[] args) 
	{
		
		MyDate ob=new MyDate();
		ob.accept();
		try
		{
			
			if(ob.dd<=31 && ob.mm<=12 )
			{
				ob.disp();
			}
			else
			{
				throw new InvalidDate();
			}
		}
		catch(Exception e)
		{
			System.out.println("Error = "+e);
		}

	}

}
