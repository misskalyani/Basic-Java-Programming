import java.util.*;

class NegativeAgeException extends Exception
{
	public String toString()
	{
		return "Negative Age Error";
	}
}
class md
{
	public static void main(String ar[])
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age = ");
		int age=sc.nextInt();
		if(age<0)
			throw new NegativeAgeException();
			System.out.println("Age = "+age);
			}
		catch(NegativeAgeException e)
		{
			System.out.println("Error = "+e);
		}
		catch(Exception e1)
		{
			System.out.println("Error = "+e1);
		}
	}
}
