package SLIP16;
//Q1) Write a program to find the Square of given number using function interface.
interface I1
{
	void square(int n);
}

public class Q1 
{
	
		public void square(int n)
		{
			System.out.println("Square= "+n*n);
		}
	
	
	public static void main(String[] args) 
	{
		Q1 ob=new Q1();
		ob.square(5);

	}

}
