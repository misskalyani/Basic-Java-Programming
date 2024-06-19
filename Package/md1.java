import string.*;
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
		compare ob=new compare();
		ob.Compare(s1,s2);
		concat ob1=new concat();
		ob1.Concat(s1,s2);
	}
}
