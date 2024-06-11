import java.util.*;
class NumberIsZero extends Exception
{
	public String toString()
	{
		return "Number Is Zero....!";
	}
}
class demo
{
	public static void main(String ae[])
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number = ");
			int n=sc.nextInt();
			if(n==0)
			{
				throw new NumberIsZero();
			}
			int n1=n;
			int r=0;
			while(n>0)
			{
				int d=n%10;
				r=(r*10)+d;
				n/=10;
			}
			if(r==n1)
			 System.out.println("Number Is Pallindrome ");
			else
			 System.out.println("Number Is NOT Pallindrome "); 
		}
		catch(NumberIsZero e)
		{
			System.out.println(e);
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
}
