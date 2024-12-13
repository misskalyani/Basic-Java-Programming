//c) Write a Java program to accept n number from user & store only perfect numbers into array & display that array.
import java.util.Scanner;
public class Q16 
{
		public static void main(String[] args) 
		{
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter n:");
	    int n = sc.nextInt();
	    int[]  a = new int[n];

	    System.out.println("Enter numbers:");
	    int count = 0;
	    for (int i = 0; i < n; i++) 
	    {
	    	int num = sc.nextInt();
	    	if (isPerfect(num))
	    	{
	    		a[count++] = num;
	    	}
	    }

	    System.out.println("Perfect numbers:");
	    for (int i = 0; i < count; i++) 
	    {
	      System.out.print(a[i] + " ");
	    }
	  }

	  public static boolean isPerfect(int num) 
	  {
	    int sum = 0;
	    for (int i = 1; i < num; i++) 
	    {
	      if (num % i == 0) 
	      {
	        sum += i;
	      }
	    }
	    return sum == num;
	  }
}
