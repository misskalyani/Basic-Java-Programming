class A
{
	protected int no;
	void accept()
	{
		no=5;
	}
}
class B
{
	void disp()
	{
		A ob=new A();
		ob.accept();
		System.out.println("Number = "+ob.no);
	}
}
class md
{
	public static void main(String a[])
	{
		B ob=new B();

		ob.disp();
	}
}
