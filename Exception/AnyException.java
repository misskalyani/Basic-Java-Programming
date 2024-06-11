class demo
{
	public static void main(String ar[])
	{
	  int b=0,c=0,e=0,d=0;
		try
		{
			int a=10;
			b=a+5;
			c=a-5;
			d=a/0;//ArthemeticException...
			e=a*5;
			String s="shonnuu13";
			int s1=Integer.parseInt(s);
			 			System.out.println("String = "+s1);
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Error 1 = "+e1.getMessage());
		}
		catch(StringIndexOutOfBoundsException e2)
		{
			System.out.println("Error 2= "+e2.getMessage());
		}
		catch(NumberFormatException e3)
		{
		  System.out.println("Error 3
		  = "+e3.getMessage());
		}
		catch(Exception e4)
		{
		  System.out.println("Error 4= "+e4.getMessage());
		}
		finally
		{
			System.out.println("Addition = "+b);
			System.out.println("Subtraction = "+c);
			System.out.println("Division = "+d);
			System.out.println("Multiplication = "+e);
		}
 }
}
