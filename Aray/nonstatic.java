class add
{
	static void ADD(int a, int b)
	{
		int c= a+b;
		System.out.print("\n ADD = "+c);
	}
 void square(int a)
	{
		int c= a*a;
		System.out.print("\n Square = "+c);
	}
	public static void main(String arg[])
	{
	  add ob=new add();
	  ob.add(7,4);
		ADD(6,9);
		add.square(8);
	}
}
