import java.util.*;
interface shape
{
	final float PI=3.14f;
	abstract void area();
		Scanner sc=new Scanner(System.in);
}
class circle implements shape
{
	float r;
	public void area()
	{
	  System.out.print("Enter Radius = ");
	  r=sc.nextFloat();
		float a=PI*r*r;
		System.out.println("Area Of Circle ="+a);
	}
}
class sphere implements shape
{
	float r;
	public void area()
	{
	  System.out.print("Enter Radius = ");
	  r=sc.nextFloat();
		float a=4*PI*r*r;
		System.out.println("Area Of Sphere ="+a);
	}
}
class Mdemo
{
  public static void main(String arg[])
  {
    circle ob=new circle();
    ob.area();
    sphere ob1=new sphere();
    ob1.area();
  }
}
