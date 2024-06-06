class A
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition 1 = "+c);
	}
}
class B extends A
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition 2= "+c);
	}
}
class Md
{
	public static void main(String arg[])
	{
		B ob=new B();
		ob.add(34,78);
		ob.add(5,8);
		ob.add(4,3);
	}
}
