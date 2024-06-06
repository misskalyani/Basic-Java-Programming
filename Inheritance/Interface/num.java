import java.util.*;
interface Integer
{
	void check(int n);
}
class demo implements Integer
{
	public void check(int n)
	{
		if(n>0)
		{
			System.out.println("Number is Positive");
		}
		else
		{
			System.out.println("Number is Negative");
		}
	}
	public static void main(String ar[])
	{
		demo ob=new demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number = ");
		int n=sc.nextInt();
		ob.check(n);
		
	}
}
