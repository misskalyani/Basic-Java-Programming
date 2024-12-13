//b) Define user define exception zeronumber Exc. Write a Java program to accept a number from user. If it is zero then throw 
//user define exception "Number is zero" otherwise calculate the sum of first & last digit of given number. (use Static Keyword).
import java.util.*;
class NumberException extends Exception
{
	public String toString()
	{
		return"Number is Zero";
	}
}

public class Q4 {

	public static void main(String ar[])
	{
	  try
	  {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter Number = ");
		    int n=sc.nextInt();
		    if(n==0)
		    {
		      throw new NumberException();
		    }
		    int last=n%10;
		    int first =0;
		    while(n>0)
		    {
		    	first=n%10;
		    	n=n/10;
		    }
		    System.out.println("Sum Of First And Last Digit = "+(first+last));
	  }   
	  catch(Exception e)
	  {
	    System.out.println(e);
	  }
	}

}
