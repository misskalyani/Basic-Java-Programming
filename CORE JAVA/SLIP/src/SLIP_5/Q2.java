package SLIP_5;
import java.util.*;
//Q2) Write a menu driven program to perform the following operations on multidimensional array ie matrices :
// Addition
// Multiplication
// Exit
public class Q2 
{

	public static void main(String[] args) 
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rows of First Matrix");
		int r1=sc.nextInt();
		System.out.println("Enter Columns of First matrix ");
		int c1=sc.nextInt();
		int a[][]=new int[r1][c1];
		System.out.println("Enter Rows of Second matrix ");
		int r2=sc.nextInt();
		System.out.println("Enter Columns of Second matrix");
		int c2=sc.nextInt();
		int b[][]=new int[r2][c2];
		System.out.println("Enter Element First matrix ");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();
			}	
		}	
		System.out.println("Enter Element Second Matrix ");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				b[i][j]=sc.nextInt();
			}	
		}	
		System.out.println("First Matrix Elements ");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(a[i][j]+"\t");
			}	
			System.out.println("");
		}	
		System.out.println("Second Matrix Elements ");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(b[i][j]+"\t");
			}	
			System.out.println("");
		}	
	      if (c1 != r2) 
	      {
	            System.out.println("Error: Matrices cannot be multiplied due to incompatible dimensions.");
	            return;
	      }
	      int c[][]=new int[r1][c1];
		do
		{
			System.out.println("Enter Choice ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					   for(int i=0;i<r1;i++)
					   {
						   for(int j=0;j<c2;j++)
						   {
							 
							   c[i][j]=a[i][j]+b[i][j];
						   }	
						 
					   }	
					   System.out.println("Addition");
					   for(int i=0;i<r1;i++)
					   {
						   for(int j=0;j<c1;j++)
						   {
							   System.out.print(c[i][j]+"\t");
						   }	
						   System.out.println("");
					   }
					   break;
			   case 2:System.out.println("Multiplication");
					  for(int i=0;i<r1;i++)
					  {
						  for(int j=0;j<c2;j++)
						  {
							  for(int k=0;k<c1;k++)
							  {
								  c[i][j]+=a[i][k]*b[k][j];
							  }
						  }	
						  System.out.println("");
					  }
					  System.out.println("Multiplication");
					   for(int i=0;i<r1;i++)
					   {
						   for(int j=0;j<c1;j++)
						   {
							   System.out.print(c[i][j]+"\t");
						   }	
						   System.out.println("");
					   }
					   break;
			   	default:System.out.println("Exit");
					  	break;
			}
		}while(ch!=3);

	}
}
/*OUTPUT:
Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
Enter Rows of First Matrix
2
Enter Columns of First matrix 
2
Enter Rows of Second matrix 
2
Enter Columns of Second matrix
2
Enter Element First matrix 
1
2
3
4
Enter Element Second Matrix 
1
2
3
4
First Matrix Elements 
1	2	
3	4	
Second Matrix Elements 
1	2	
3	4	
Enter Choice 
1
Addition
2	4	
6	8	
Enter Choice 
2
Multiplication


Multiplication
9	14	
21	30	
Enter Choice 
3
Exit
Enter Choice 
8
Exit
*/