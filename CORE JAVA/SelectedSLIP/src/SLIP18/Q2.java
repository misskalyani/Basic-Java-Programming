package SLIP18;


import java.util.*;
//Q2) Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns, bat_avg).
//Create an array of n player objects .Calculate the batting average for each player using static
//method avg(). Define a static sort method which sorts the array on the basis of average. Display
//the player details in sorted order.
class CricketPlayer
{
	int noi,not,tot;
	int batavg;
	String nm;
	Scanner sc=new Scanner(System.in);
	void accept()
	{
		System.out.println("Enter Player Name = ");
		nm=sc.next();
		System.out.println("Enter no of innings = ");
		noi=sc.nextInt();
		System.out.println("Enter not out = ");
		not=sc.nextInt();
		System.out.println("Enter Total run = ");
		tot=sc.nextInt();
		batavg=avg(noi,tot,not);
	}
	static int avg(int noi,int tot,int not)
	{
		return tot/(noi-not);
	}
	static void sort(CricketPlayer ob[],int n)
	{
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(ob[i].batavg<ob[j].batavg)
				{
					CricketPlayer temp=ob[i];
					ob[i]=ob[j];
					ob[j]=temp;
				}
			}
		}
	}
	void disp()
	{
		System.out.println("\n"+nm+"\t\t"+noi+"\t"+not+"\t"+tot+"\t\t"+batavg);
	}
}
public class Q2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit ");
		int n=sc.nextInt();
		CricketPlayer ob[]=new CricketPlayer[n];
		for(int i=0;i<n;i++)
		{
			ob[i]=new CricketPlayer();
			ob[i].accept();
		}
		System.out.println("Name\t\tInnings\tNotout\tTotalRun\tBatavg");
		for(int i=0;i<n;i++)
		{
			ob[i].disp();
		}
	}

}
/*OUTPUT
Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
Enter Limit 
4
Enter Player Name = 
Om
Enter no of innings = 
10
Enter not out = 
2
Enter Total run = 
500
Enter Player Name = 
Sai
Enter no of innings = 
10
Enter not out = 
4
Enter Total run = 
1000
Enter Player Name = 
Ram
Enter no of innings = 
10
Enter not out = 
3
Enter Total run = 
600
Enter Player Name = 
Sham
Enter no of innings = 
10
Enter not out = 
8
Enter Total run = 
800
Name		Innings	Notout	TotalRun	Batavg

Om		     10	      2		  500	      62

Sai		     10	  	  4	 	  1000	      166

Ram			 10		  3		  600		  85

Sham		 10		  8		  800		  400
*/	