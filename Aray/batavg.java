
import java.util.*;
class cricket
{
	String name;
	int innings,trun,notout,batavg;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Player Name = ");
		name=sc.next();
		System.out.println("Enter no of innings = ");
		innings=sc.nextInt();
		System.out.println("Enter not out = ");
		notout=sc.nextInt();
		System.out.println("Enter Total run = ");
		trun=sc.nextInt();
		batavg=avg(innings,trun,notout);
	}
	void disp()
	{
	  System.out.println("\n"+name+"\t"+innings+"\t"+notout+"\t"+trun+"\t "+batavg);
	}
	static int avg(int innings,int trun,int notout)
	{
		return trun/(innings-notout);
	}
	static void sort(cricket ob[],int n)
	{
		int pass,i;
		for(pass=0;pass<n;pass++)
		{
			for(i=0;i<pass-n;i++)
			{
				if(ob[i].batavg<ob[i+1].batavg)
				{
					cricket t=ob[i];
					ob[i]=ob[i+1];
					ob[i+1]=t;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println("\n"+ob[i].name+"\t"+ob[i].innings+"\t"+ob[i].notout+"\t"+ob[i].trun+"\t "+ob[i].batavg);
		}
	}
	public static void main(String arg[])
	{
		cricket ob[]=new cricket[20];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Limit = ");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		  ob[i]=new cricket();
		  ob[i].accept();
		}
		System.out.println("\n Name\tInnings\tNotOut\tTotalRun  batAvg\n");
		for(int i=0;i<n;i++)
		{
		  ob[i].disp();
		}
		System.out.println("\nSOrted Order by Bat Average \n\n");
		System.out.println("\n Name\tInnings\tNotOut\tTotalRun  batAvg\n");
		sort(ob,n);
	}
}
