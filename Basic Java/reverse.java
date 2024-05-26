import java.util.*;
class pallindrome
{

	public static void main(String arg [])
	{
		int rev=0,n,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number = ");
		n=sc.nextInt();
		a=n;
		while(n>0)
		{
			a=n%10;
			rev=(rev*10)+a;
			n=n/10;
		}
		System.out.println("Reverse = "+rev);
		if(n==rev)
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println(" Not Pallindrome");
		}
	}
}
