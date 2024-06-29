import java.util.*;
public class concat
{
	public void Concat(String s1,String s2)
	{
		String s=s1+s2;
			System.out.println("Concat String "+s);
		
	}
}

class demo
{
	public static void main(String []arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String ");
		String s1=sc.next();
		System.out.println("Enter Second String ");
		String s2=sc.next();
	
		concat ob1=new concat();
		ob1.Concat(s1,s2);
	}
}
