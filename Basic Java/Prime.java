class Prime
{
	public static void main(String arg[])
	{
		int i,n=5;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				break;
			}
		}
		if(i==n)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}
}
