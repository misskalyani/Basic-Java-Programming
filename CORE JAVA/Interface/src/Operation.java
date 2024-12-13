import java.util.Scanner;

interface Option
{
    float PI=3.14f;
    Scanner sc=new Scanner(System.in);
    public void area();
    public void volume();
}
class cylinder implements Option
{
    float r,h,a,v;

    public void area()
    {
        System.out.println("Enter Radius = ");
        r=sc.nextFloat();
        System.out.println("Enter Height = ");
        h=sc.nextFloat();
        a=2*PI*r*(r+h);
        System.out.println("Area Of Cylinder = "+a);
    }
    public void volume()
    {
        v=PI*r*r*h;
        System.out.println("Volume Of Cylinder = "+v);
    }

}
public class Operation
{
    public static void main(String[] args)
    {
        cylinder ob = new cylinder();
        ob.area();
        ob.volume();
    }
}
