import java.util.*;
class cricket
{
	String name;
	int innings,trun,notout,avg;
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
		avg=trun/notout;
	}
	void disp()
	{
	  System.out.println("\n"+name+"\t"+innings+"\t"+notout+"\t"+trun+"\t "+avg);
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
		System.out.println("\n Name\tInnings\tNotOut\tTotalRun  Avg\n");
		for(int i=0;i<n;i++)
		{
		  ob[i].disp();
		}
	}
}
