import java.util.*;
class add
{
	public static void main(String []arg)
	{
		int ch,c,a,b;
		
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("\n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
		  System.out.println("Enter Choice");
		 
		  ch=sc.nextInt();
			switch(ch)
			{
				case 1:a=Integer.parseInt(arg[0]);
		           b=Integer.parseInt(arg[1]);
				       c=a+b;
				       System.out.println("Addition = "+c);
				       break;
				case 2:a=Integer.parseInt(arg[0]);
	      	     b=Integer.parseInt(arg[1]);
				       c=a-b;
				       System.out.println("Subtraction = "+c);
				       break;
				case 3:a=Integer.parseInt(arg[0]);
		           b=Integer.parseInt(arg[1]);
				       c=a/b;
				       System.out.println("Division = "+c);
				       break;
				case 4:a=Integer.parseInt(arg[0]);
		           b=Integer.parseInt(arg[1]);
				       c=a*b;
				       System.out.println("Multiplication = "+c);   
				       break;
			}
		}while(ch<5);
	}
}
