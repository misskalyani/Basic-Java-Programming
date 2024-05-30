class Area
{
	void area(float r)
	{
	float a;
	 a=3.14f*r*r;
	 System.out.print("\nArea of Circle = "+a);
	}
	void area(float h,float b)
	{
	 float a1;
	 a1=0.5f*h*b;
	 System.out.print("\nArea of Rectangle = "+a1);
	}
	void area(int s)
	{
	 int a3=s*s;
	 System.out.print("\nArea of Square = "+s);
	}
	void area(int l,long b)
	{
	 long a4=l*b;
	 System.out.print("\nArea of Rectangle = "+a4);
	}
	public static void main(String str[])
	{
	 Area ob=new Area();
	 ob.area(5.8f);
	 ob.area(6.3f,98.5f);
	 ob.area(6);
	 ob.area(67,98765432);
	}
}
