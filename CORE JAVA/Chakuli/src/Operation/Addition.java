package Operation;

class Maximum
{
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void sub(float a,float b)
	{
		System.out.println(a-b);
	}
}
public class Addition extends Maximum
{
	public void max(int a,int b)
	{
		if(a>b)
			System.out.println("a max");
		else
			System.out.println("b max");
	}
}

