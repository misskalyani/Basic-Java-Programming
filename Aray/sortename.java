import java.util.*;
class emp
{
	String ename;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Empname = ");
		ename=sc.next();
	}
	void disp()
	{
		System.out.println(ename);
	}
	static void sort(emp ob[],int n)
	{
		int i;
		String t;
		for(int pass=0;pass<n;pass++)
		{
			for(i=0;i<n;i++)
			{
				if(ob[i].ename.compareTo(ob[i+1].ename));
				{
					t=ob[i].ename;
					ob[i].ename=ob[i+1].ename;
					ob[i+1].ename=t;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(ob[i].ename);
		}
	}
	public static void main(String ary[])
	{
	 int i;
		emp ob[]=new emp[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit = ");
		int n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			ob[i]=new emp();
			ob[i].accept();
		}
		System.out.println("\nempname ");
		for(i=0;i<n;i++)
		{
			ob[i].disp();
		}
		System.out.println("Sorted Orderdr emp name");
		sort(ob,n);
	}
}
