class demo
{
	public static void main(String ar[])
	{
		try
		{
			int a[]={4,7,8,9,3,9};
			for(int i=0;i<=a.length;i++)
			{
				//ArrayIndexOutOfBoundsException...
				System.out.print(a[i]+" ");
			}	
		}
		catch(Exception e)
		{
			System.out.println("\nError = "+e);
		}
	}
}
