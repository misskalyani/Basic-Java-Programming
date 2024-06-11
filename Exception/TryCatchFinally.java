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
		}
		catch(Exception e1)
		{
			System.out.println("Error = "+e1.getMessage());
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
