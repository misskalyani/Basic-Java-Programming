import java.util.*;
abstract class shape
{
	abstract void cal_area();
	abstract void cal_volume();
}
class sphere extends shape
{
	float r;
	sphere(float r)
	{
		this.r=r;
	}
	void cal_area()
	{
		float a=4*3.14f*r*r;
		System.out.println("\nArea of sphere = "+a);
	}
	void cal_volume()
	{
		float v=(4/3)*3.14f*r*r*r;
		System.out.println("\nVolume of sphere = "+v);
	}
}
class cone extends shape
{
	float r,h;
	cone(float r,float h)
	{
		this.r=r;
		this.h=h;
	}
	void cal_area()
	{
		float a=3.14f*r*(r+h*h+r*r);
		System.out.println("\nArea of cone = "+a);
	}
	void cal_volume()
	{
		float v=3.14f*r*r*(h/3);
		System.out.println("\nVolume of cone = "+v);
	}
}
class Mdemo
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Radius = ");
		float r=sc.nextFloat();
		System.out.print("Enter Height = ");
		float h=sc.nextFloat();
		sphere ob=new sphere(r);
		ob.cal_area();
		ob.cal_volume();
		
		cone ob1=new cone(r,h);
		ob1.cal_area();
		ob1.cal_volume();
	}
}
