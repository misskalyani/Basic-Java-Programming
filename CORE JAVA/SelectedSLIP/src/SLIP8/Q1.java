package SLIP8;

import java.util.*;
//Q1) Create a class Sphere, to calculate the volume and surface area of sphere.
//(Hint : Surface area=4*3.14(r*r), Volume=(4/3)3.14(r*r*r))
class sphere
{
	void volume(float r)
	{
		float v=(4/3)*3.14f*(r*r*r);
		System.out.println("Vloume Of Sphere = "+v);
	}
	public void area(float r)
	{
		float a=4*3.14f*(r*r);
		System.out.println("Surface Area of Sphere = "+a);
	}
}
public class Q1 
{
	public static void main(String[] args) 
	{
		sphere ob=new sphere();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius ");
		float r=sc.nextFloat();
		ob.volume(r);
		ob.area(r);

	}

}
/*OUTPUT:
Enter Radius 
4.5
Vloume Of Sphere = 286.1325
Surface Area of Sphere = 254.34001
*/
