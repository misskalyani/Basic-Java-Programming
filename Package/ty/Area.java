package ty;
public class Area
{
	public void circle(float r)
	{
		float a=3.14f*r*r;
		System.out.println("Area Of Circle = "+a);
	}
	public void rectangle(float l, float b)
	{
		float a=l*b;
		System.out.println("Area Of Rectangle = "+a);
	}
	public void square(float s)
	{
		float a=s*s;
		System.out.println("Area Of Square= "+a);
	}
}
