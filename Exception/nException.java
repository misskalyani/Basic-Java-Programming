class demo
{
	public static void main(String ar[])
	{
		try
		{
			int a[]=new int[5];
		    a[7]=9;
		    System.out.println(a[7]);
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Error 1 = "+e1.getMessage());
		}
		catch(StringIndexOutOfBoundsException e2)
		{
			System.out.println("Error 2= "+e2.getMessage());
		}
		catch(Exception e3)
		{
		  System.out.println("Error 3 = "+e3);
		}
 }
}
