package SLIP14;
import java.util.*;
//Q1) Write a program to accept a number from the user, if number is zero then throw user defined
//exception “Number is 0” otherwise check whether no is prime or not (Use static keyword).
class ZeroException extends Exception
{
	public String toString()
	{
		return "Zero Error Execption";
	}
	
}
public class Q1 
{

	public static void main(String[] args) 
	{
		int i,f=0;
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter Number = ");
			int n=sc.nextInt();
			if(n==0)
			{
				throw new ZeroException();
			}
			else
			{
				for(i=2;i<n;i++)
				{
					if(n==i)
					{
						f=1;
						break;
					}
				}
				if(f==1)
				{
					System.out.println("Number Is Prime");
				}
				else
				{
					System.out.println("Number Is NOT Prime");
				}
			}
		}	
		catch(Exception e)
		{
			System.out.println("Error = "+e);
		}
	}

}
