import java.util.*;
class InvalidEmailException extends Exception
{
	public String toString()
	{
		return"Invalid Email Id";
	}
}
class md
{
	public static void main(String ar[])
	{
	  try
	  {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter Email Id = ");
		    String n=sc.next();
		    int t=0;
		    for(int i=0;i<n.length();i++)
		    {
		        char ch=n.charAt(i);
		        if(ch=='@')
		          t=1;
		    }
		    if(t==0)
		    {
		      throw new InvalidEmailException();
		    }
		    
		    System.out.println("Email Id = "+n);
	  }   
	  catch(Exception e)
	  {
	    System.out.println(e);
	  }
	}
}
