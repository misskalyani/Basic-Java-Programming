class demo
{
	public static void main(String []arg)
	{
		String s1="cdj clg,rbnb clg,jts clg";
		String s2[]=s1.split(",");
		System.out.println("original string = "+s1);
		System.out.println("Split string = ");
		for(int i=0;i<s2.length;i++)
		{
		  System.out.print(s2[i]);
		}
	}
}
