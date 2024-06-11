import java.util.*;
class string
{
	public static void main(String arg[])
	{
	  int f=0;
	  char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name = ");
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
		      ch=s.charAt(i);
		      if((Character.isLowerCase(ch)    || Character.isUpperCase(ch) ) && (Character.isDigit(ch)))
		      {
		            f=1;     
		      }
		}
		if(f==1)
		{
		    System.out.println("Name Is Valid ");
		}
		else
	  {
		    System.out.println("Name Is Not  Valid ");
		}
	}
}
