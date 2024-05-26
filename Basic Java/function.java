
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
	  System.out.println("Area of Square = "+a);
	}
	void triangle(float b,float h)
	{
	  a=(1/2)*b*h;
	  System.out.println("Area of Triangle = "+a);
	}
	public static void main(String str[])
  {
	  Area ob;
	  ob=new Area();
	  ob.circle(5.6f);
	  ob.rectangle(5.8f,9.7f);
	  ob.square(6.8f);
	  ob.triangle(8.4f,2.9f);
  }
}

