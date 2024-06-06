import java.util.*;
interface operation
{
	final float PI=3.142f;
	void area(float r,float h);
	void volume(float r,float h);
}
class cylinder implements operation
{
  
	public void area(float r,float h)
	{
		float a=(2*PI*r*h)+2*PI*r*r;
		System.out.println("Area Of Cylinder = "+a);
	}
	public void volume(float r,float h)
	{
		float v=PI*r*r*h;
		System.out.println("Volume Of Cylinder = "+v);
	}
	public static void main(String arg[])
	{
		cylinder ob =new cylinder();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius");
		float r=sc.nextFloat();
		System.out.println("Enter Height");
		float h=sc.nextFloat();
		ob.area(r,h);
		ob.volume(r,h);
	}
}
