package SLIP11;




//Q1) Define an interface “Operation” which has method volume( ).Define a constant PI having a value
//3.142 Create a class cylinder which implements this interface (members – radius, height). Create
//one object and calculate the volume.
interface Operation
{

	final float PI=3.142f;
	void volume(float r,float h);
}
class cylinder implements Operation
{
	float r,h,v;
	public void volume(float r,float h)
	{
		v=PI*r*r*h;
		System.out.println("Volume of cylinder = "+v);
	}
}
public class Q1 
{
	
	public static void main(String[] args) 
	{
		 cylinder ob=new cylinder();
		 ob.volume(5.6f,6.3f);

	}

}
/*OUTPUT:
Volume of cylinder = 620.75867
*/
