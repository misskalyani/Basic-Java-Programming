import java.util.*;
class Prime
{
	public static void main(String arg[])
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num = ");
		int n=sc.nextInt();
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				break;
			}
		}
		if(i==n)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}
}
