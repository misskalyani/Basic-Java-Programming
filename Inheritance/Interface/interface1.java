import java.util.*;
interface I1
{
	void area();
	Scanner sc=new Scanner(System.in);
}
class rectangle implements I1
{
	public void area()
	{
		System.out.print("Enter Length = ");
		float l=sc.nextFloat();
		System.out.print("Enter Breadth = ");
		float b=sc.nextFloat();
		float a=l*b;
		System.out.println("\nArea Of Rectangle ="+a);	
	}
}
class square extends rectangle implements I1
{
	float s;
	public void area()
	{
	  System.out.print("Enter Side = ");
	  s=sc.nextFloat();
		float a=s*s;
		System.out.println("\nArea Of Square ="+a);
	}
}
class circle implements I1
{
	float r;
	public void area()
	{
	  System.out.print("Enter Radius = ");
	  r=sc.nextFloat();
	  float a=3.15f*r*r;
	  System.out.println("\nArea Of Circle ="+a);
	}
}
class Mdemo
{
  public static void main(String arg[])
  {
    circle ob=new circle();
    ob.area();
    square ob1=new square();
    ob1.area();
    rectangle ob2=new rectangle();
    ob2.area();
  }
}
