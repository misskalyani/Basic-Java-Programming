package SLIP10;


//Q1) Write a program to find the cube of given number using functional interface.
interface Cube
{
	void Cube(int c);
}
class Q1 implements Cube
{
	public void Cube(int c)
	{
		System.out.println("Cube Of Number = "+(c*c*c));
	}
	public static void main(String[] args) 
	{
		Q1 ob = new Q1();
		ob.Cube(4);
	}

}
/*OUTPUT:
Cube Of Number = 64
*/