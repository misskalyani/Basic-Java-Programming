class add
{
	int ADD(int a, int b)
	{
		int c= a+b;
		return c;
	}
 	int ADD(int a)
	{
		int c= a*a;
		return c;
	}
	public static void main(String arg[])
	{
	  add ob=new add();

		 System.out.print("ADD = "	+	ob.ADD(6,9));
		int c=ob.ADD(8);
		 System.out.print("\nADD = "+c);
	}
}
