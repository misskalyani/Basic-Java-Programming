package SLIP11;

//Q2) Write a program to accept the username and password from user if username and password are
//not same then raise "Invalid Password" with appropriate msg.
import java.io.*;
import java.util.*;
class InvalidPasswordException extends Exception
{
	public String toString()
	{
		return "Invalid User Password Exception";
	}
}
public class Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter User Name : ");
			String nm=sc.next();
			System.out.println("Enter Password : ");
			String ps=sc.next();
			if(nm.equals(ps))
			{
				System.out.println("User Name And Password Are Same ");
			}
			else
			{
				throw new InvalidPasswordException();
			}
		}
		catch(Exception e)
		{
			System.out.println("Error = "+e);
		}
		
	}

}

