import java.util.*;
class demo
{
	public static void main(String []arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String ");
		String s1=sc.next();
		System.out.println("Enter Second String ");
		String s2=sc.next();
		int k=s1.compareTo(s2);
		if(k==0)
		{
			System.out.println("Strings Are Same");
		}
		if(k>0)
		{
			System.out.println("String1 Greater");
		}
		if(k<0)
		{
			System.out.println("String2 Greater");
		}
	}
}
