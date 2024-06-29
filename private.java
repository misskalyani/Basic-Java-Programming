class A
{
	private int no;
	void accept()
	{
		no=5;
	}
	void disp()
	{
	  	System.out.println("Number = "+no);
	}
}
/*class B
{
	void disp()
	{
		A ob=new A();
		ob.accept();
		System.out.println("Number = "+ob.no);
	}
}*/
class md
{
	public static void main(String a[])
	{
		A ob=new A();
    ob.accept();
		ob.disp();
	}
}
