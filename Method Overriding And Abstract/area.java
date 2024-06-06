import java.util.*;
abstract class Shape
{
	Scanner sc=new Scanner(System.in);
	abstract void area();
}
class Rectangle extends Shape
{
	Float l,b;
	void area()
	{
		System.out.print("Enter Length = ");
		l=sc.nextFloat();
		System.out.print("Enter Breadth = ");
		b=sc.nextFloat();
		Float a=l*b;
		System.out.println("Area Of Rectangle = "+a);
	}
}
class Triangle extends Shape
{
	Float h,b;
	void area()
	{
		System.out.print("Enter Base = ");
		b=sc.nextFloat();
		System.out.print("Enter Height = ");
		h=sc.nextFloat();
		Float a=0.5f*b*h;
		System.out.println("Area Of Triangle = "+a);
	}
}
class Mdemo
{
	public static void main(String arg[])
	{
		
		Rectangle ob1=new Rectangle();
		ob1.area();
		Triangle ob=new Triangle();
		ob.area();
	}
}
