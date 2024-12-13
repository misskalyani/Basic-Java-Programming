/*c) Define an interface shape with abstract method area( ). Write a Java program to calculate area of rectangle.
 * c) Define abstract class shape with abstract method area (). Write a java program to calculate area of circle
*/

interface Shape 
{
	void RectangleArea(double l,double w);
}

class Rectangle implements Shape
{
	double length;
    double width,area=0;

    public void RectangleArea(double length, double width) 
    {
    	this.length = length;
    	this.width = width;
    	area=length * width;
    	System.out.println("Area: " + area);
    }
}
public class Q3 {

	public static void main(String[] args) 
	{
	    Rectangle rectangle = new Rectangle();
	   rectangle.RectangleArea(4,5);
	   
	 }

}
