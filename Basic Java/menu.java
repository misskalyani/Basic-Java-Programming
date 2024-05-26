import java.util.*;
class Area
{
	float a;
	void circle(float r)
	{
		a=3.14f*r*r;
		System.out.println("Area of circle = "+a);
	}
	void rectangle(float l,float b)
	{
		a=l*b;
		System.out.println("Area of rectangle = "+a);
	}
	void square(float s)
	{
		a=s*s;
		System.out.println("Area of square = "+a);
	}
	void triangle(float b,float h)
	{
		a=0.5f*b*h;
		System.out.println("Area of triangle = "+a);
	}
	public static void main(String arg[])
	{
	  int ch;
		Area ob;
		ob=new Area();
		do
		{
			System.out.println("1-Area Of Circle");
			System.out.println("2-Area Of Rectangle");
			System.out.println("3-Area Of Square");
			System.out.println("4-Area Of Triangle");
			Scanner sc=new Scanner(System.in); 
			System.out.print("Enter Choice = ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:Scanner a=new Scanner(System.in); 
				       System.out.print("Enter Radius = ");
				       float r=sc.nextFloat();
				       ob.circle(r);
				       break;
				case 2:Scanner c=new Scanner(System.in);
				       System.out.print("Enter Length = ");
				       float l=c.nextFloat();
				       Scanner d=new Scanner(System.in);
				       System.out.print("Enter Breadth = ");
				       float b=d.nextFloat();
				       ob.rectangle(l,b);
				       break;
				case 3:Scanner e=new Scanner(System.in);
				       System.out.print("Enter Side = ");
				       float s=e.nextFloat();
				       ob.square(s);
				       break;
				case 4:Scanner t=new Scanner(System.in);
				       System.out.print("Enter Base = ");
				       float b1=t.nextFloat();
				       Scanner t2=new Scanner(System.in);
				       System.out.print("Enter Height = ");
				       float h=t2.nextFloat();
				       ob.triangle(b1,h);
				       break;
			}
			
		}while(ch<5);
	}
}
