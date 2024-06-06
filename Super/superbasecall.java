import java.util.*;
class A
{
  A(float r)
  {
    float a=3.14f*r*r;
	  System.out.println("Area Of Circle = "+a);
  }
}
class B extends A
{
  B(float r,float h)
  {
    super(r);
    float a=3.14f*r*r*h;
	  System.out.println("Area Of Cylinder = "+a);
  }
}
class MD
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Radius = ");
    float r=sc.nextFloat();
     System.out.print("Enter Height = ");
    float h=sc.nextFloat();
    B ob = new B(r,h);
  }
}
