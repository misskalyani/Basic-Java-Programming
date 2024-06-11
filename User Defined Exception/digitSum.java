import java.util.*;
class NumberException extends Exception
{
	public String toString()
	{
		return"Number is Zero";
	}
}
class md
{
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
