import java.util.*;
class demo
{
	public static void main(String arg[])
	{
	  int i;
		int a[]=new int[10];
		int b[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit First Ary = ");
		int n1 =sc.nextInt();
		System.out.println("Enter Limit Second Ary = ");
		int n2 =sc.nextInt();
		System.out.println("Enter First Ary number = ");
		for(i=0;i<=n1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Second Ary numbers = ");
		for(i=0;i<=n2;i++)
		{
		  b[i]=sc.nextInt();
		}
		System.out.println("Union = ");
		for(i=0;i<=n1;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(i=0;i<=n2;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}

