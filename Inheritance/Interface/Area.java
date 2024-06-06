import java.util.*;
interface Shape
{
	final float PI=3.142f;
	void area_circle(float r);
	void area_sphere(float r);
}
class Area implements Shape
{
  
	public void area_circle(float r)
	{
		float a=PI*r*r;
		System.out.println("Area Of Circle = "+a);
	}
	public void area_sphere(float r)
	{
		float v=4*PI*r*r;
		System.out.println("Volume Of Sphere = "+v);
	}
	public static void main(String arg[])
	{
		Area ob =new Area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius");
		float r=sc.nextFloat();
		ob.area_circle(r);
		ob.area_sphere(r);
	}
}
