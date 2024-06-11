
import java.util.*;
class demo
{
	public static void main(String []arg)
	{
	  char ch;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String = ");
		String s1=sc.next();
		for(int i=0;i<s1.length();i++)
		{
		  ch=s1.charAt(i);
			if(Character.isUpperCase(ch))
			{
				System.out.print(Character.toLowerCase(ch));
			}
			if(Character.isLowerCase(ch))
			{
				System.out.print(Character.toUpperCase(ch));
			}
			if(Character.isDigit(ch))
			{
				System.out.print("*");
			}
		}
	}
}
