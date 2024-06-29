import java.util.*;
class NumberException extends Exception
{
	public String toString()
	{
		return"Number is Out Of Range";
	}
}
class md
{
	public static void main(String ar[])
	{
	  static int s=0;
	  try
	  {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter Number = ");
		    int n=sc.nextInt();
		    if(n>100)
		    {
		      throw new NumberException();
		    }
		  
		    n=n%10;
		    s=s+n;
		    n=n
		    System.out.println(s);
	  }   
	  catch(Exception e)
	  {
	    System.out.println(e);
	  }
	}
}
