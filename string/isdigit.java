import java.util.*;
/*class string
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name = ");
		char s=sc.next().charAt(0);
		if((s>='a' && s<='z')|| (s>='A' && s<='Z'))
		{
		  System.out.println(s+"Is Aplhabate ");
		}
		if(s>='0' &&s<='9')
		{
		  System.out.println(s+"Is Digit");
		}
		else
		{
		  System.out.println(s+"Special Character");
		}
		
	}
}*/
class demo
{
	public static void main(String []arg)
	{
		String s1=new String("Shri6533");
		System.out.println(s1);
		for(int i=0;i<s1.length();i++)
		{
			if((s1.charAt(i)>='a' && s1.charAt(i)<='z') || (s1.charAt(i)>='A' && s1.charAt(i)<='Z'))
			{
				System.out.print(s1.charAt(i));
			}
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				System.out.print("*");
			}
		}
	}
}
