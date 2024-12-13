package SLIP_3;
import java.util.*;
//Q1) Write a program to accept ‘n’ name of cities from the user and sort them in ascending order.
public class Q1 
{
	public static void main(String[] args)
	{
		String temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit ");
		int n=sc.nextInt();
		String city[]=new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter City Name ");
			city[i]=sc.next();
		}
		System.out.println("City");
		for(int i=0;i<n;i++)
		{
			System.out.println(city[i]);
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(city[i].compareTo(city[j])>0)
				{
					
					temp=city[i];
					city[i]=city[j];
					city[j]=temp;
				}
			}
		}
		System.out.println("Sorted Order City ");
		for(int i=0;i<n;i++)
		{
			System.out.println(city[i]);
		}
	}

}
/*OUTPUT
Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
Enter Limit 
5
Enter City Name 
Shrirampur
Enter City Name 
Gova
Enter City Name 
Pune
Enter City Name 
Mumbai
Enter City Name 
Jalgaon
City
Shrirampur
Gova
Pune
Mumbai
Jalgaon
Sorted Order City 
Gova
Jalgaon
Mumbai
Pune
Shrirampur
*/