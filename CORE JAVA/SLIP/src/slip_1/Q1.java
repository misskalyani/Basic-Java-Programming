package slip_1;

public class Q1 
{

	public static void main(String[] args) 
	{
		int n=args.length,flag=1,i,j;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		System.out.println("\nArray Elements Are\n");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println("\n\nPrime Numbers Are\n\n");
		for(i=0;i<n;i++)
		{
			for(j=2;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==0)
			{
				System.out.print(a[i]+"\t");
			}
		}
	}

}
/*OUTPUT
Array Elements Are

1	2	3	4	5	6	7	8	9	10	

Prime Numbers Are


4	5	6	7	8	9	10
*/