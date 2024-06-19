package math;
public class power
{
	public void power(int x,int n)
	{
		int m=1,i=1;
		while(i<=n)
		{
			m=m*x;
			i++;
		}
		System.out.println("Power = "+m);
	}
}
