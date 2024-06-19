package series;
public class fibonacci
{
	public void print(int n)
	{
		int f=0,s=1,i,t;
		System.out.print("Series = "+f+"\t"+s);
		for(i=1;i<n;i++)
		{
			t=f+s;
			System.out.print("\t"+t);
			f=s;
			s=t;
		}
	}
}
