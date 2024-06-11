class demo
{
	public static void main(String arg[])
	{
		int a[]=new int[-5];//NegativeArraySizeException
		a[0]=10;
		a[1]=67;
		a[5]=55;
		System.out.println(a[5]);
	}
}
