import java.util.*;
class area
{
	int l,b,a;
	void Area(int l,int b)
	{
		a=l*b;
		System.out.printf("Area Of rectangle = %d ",a);
	}
	void perimeter(int l,int b)
	{
		a=2*(l+b);
		System.out.printf("\nPerimeter = %d ",a);
	}
	public static void main(String arg [])
	{
		area ob=new area();
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter Length = ");
		int l=sc.nextInt();
		System.out.printf("Enter Breadth = ");
		int b=sc.nextInt();
		ob.Area(l,b);
		ob.perimeter(l,b);
	}
}
