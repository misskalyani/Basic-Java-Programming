package SLIP19;
import java.util.*;
//Q1) Write a program to accept the two dimensional array from user and display sum of its diagonal elements.
public class Q1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Limit");
		int n=sc.nextInt();
		int a[][]=new int [n][n]; 
		System.out.println("Enter Elements ");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					System.out.println(a[i][j]);
				}
				else
				{
					System.out.println("  \t");
				}
			}
			
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println("Sum Of Daigonal "+sum);
	}

}
