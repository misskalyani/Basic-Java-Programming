import java.util.*;
class demo
{
	public static void main(String arg[])
	{
	int i;
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit = ");
		int n =sc.nextInt();
		System.out.println("Enter n numbers = ");
		for(i=0;i<=n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("n numbers are = ");
		for(i=0;i<=n;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}

