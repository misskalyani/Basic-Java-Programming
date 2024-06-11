class demo
{
	public static void main(String ar[])
	{
		try
		{
			int a[]=new int[-5];
			a[0]=67;
			a[5]=89;//NegativeArraySizeException...
			System.out.println(a[5]);
		}
		catch(Exception e)
		{
			System.out.println("Error = "+e);
		}
	}
}
