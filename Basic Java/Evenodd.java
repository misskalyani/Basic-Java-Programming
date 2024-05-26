import java.util.*;
class evenodd
{
	public static void main(String str[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :: ");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Number is EVEN");
		}
		else
		{
			System.out.println("Number is ODD");
		}
	}
}
