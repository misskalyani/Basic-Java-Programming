class demo
{
	public static void main(String ar[])
	{
		try
		{
			int a=20;
			int b=a/0;//ArithmeticException....by Zero
			System.out.println("Division = "+b);
		}
		catch(Exception e)
		{
			System.out.println("Error Ocuur.... = "+e);
		}
	}
}
