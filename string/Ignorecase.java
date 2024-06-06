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
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Strings Are Equal");
		}
		else
		{
			System.out.println("Strings Are Not Equal");
		}
	}
}
