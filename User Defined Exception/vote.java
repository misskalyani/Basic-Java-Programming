import java.util.*;
class VotingException extends Exception
{
	public String toString()
	{
		return "Candidate is Not Eligible for Voting";
	}
}
class md
{
	public static void main(String ar[])
	{
	    try
	    {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter Age ");
	      int a=sc.nextInt();
	      if(a<18)
	      {
	        throw new VotingException();
	      }
	      System.out.println("You Are Eligible For Voting Age "+a);
	      
	    }
	    catch(VotingException e)
	    {
	        System.out.println("User Error = "+e);
	    }
	    catch(Exception e1)
	    {
	        System.out.println("System Error = "+e1);
	    }
	}
}
