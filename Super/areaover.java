import java.util.*;
class Circle
{
  Scanner sc=new Scanner(System.in);
	float r,h;
	void area()
	{
	  System.out.print("Enter Radius = ");
	  r=sc.nextFloat();
	  float a=3.14f*r*r;
	  System.out.println("Area Of Circle = "+a);
	}
}
class Cylinder extends Circle
{
  float r,h;
    void area()
    {
      System.out.print("Enter Radius = ");
	    r=sc.nextFloat();
	    System.out.print("Enter Height = ");
	    h=sc.nextFloat();
	    float a=3.14f*r*r*h;
	    System.out.println("Area Of Cylinder = "+a);
	    super.area();
	  }  
}
class Mdemo
{
    public static void main(String arg[])
    {
      Cylinder ob=new Cylinder();
      ob.area();
    }
}
