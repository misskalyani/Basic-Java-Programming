abstract class A
{
	A()
	{
		System.out.println("I AM abstract A");
	}
	abstract void add(int a,int b);
	void square(int n)
	{
		int s=n*n;
		System.out.println("Square Of Num = "+s);
	}
}
class B extends A
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition = "+c);
	}
}
class Md
{
	public static void main(String arg[])
	{
		B ob=new B();
		ob.add(34,78);
		ob.square(8);
	}
}
