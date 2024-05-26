import java.util.*;
class maxmin
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Num = ");
		int num1=sc.nextInt();
		Scanner n=new Scanner(System.in);
		System.out.print("Enter Second Num = ");
		int num2=n.nextInt();
		System.out.print("Enter Third Num = ");
		Scanner p=new Scanner(System.in);
		int num3=p.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.println("First Number is Mximum");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("Second Number is Maximum");
		}
		else if(num3>num1 && num3>num2)
		{
			System.out.println("Third Number is Maximum");
		}
		else if(num1<num2 || num1<num3)
		{
			System.out.println("First Number is Minimun");
		}
		else if(num2<num1 || num2<num3)
		{
			System.out.println("Second Number is Minimun");
		}
		else if(num3<num1 || num3<num2)
		{
			System.out.println("Third Number is Minimun");
		}
	}
}
