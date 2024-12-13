package SLIP_4;
import java.util.*;
//Q1) Write a program to print an array after changing the rows and columns of a given two-dimensional array.
public class Q1 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter Limit");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		System.out.println("Enter Array Elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{	
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array Elements Are ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{	
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{	
				b[i][j]=a[j][i];
			}
		}
		System.out.println("Array after changing the rows and columns i.e Transpose");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{	
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
/*OUTPUT:
 * Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
Enter Limit
3
Enter Array Elements
1
2
3
4
5
6
7
8
9
Array Elements Are 
1	2	3	
4	5	6	
7	8	9	
Array after changing the rows and columns i.e Transpose
1	4	7	
2	5	8	
3	6	9	
*/
