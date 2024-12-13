/*a) Write a Java program to accept a number from user. If it is zero then throw user defined exception "Number is zero".
 *  Otherwise calculate its factorial.*/

import java.util.Scanner;

class ZeroException extends Exception 
{
	public String toString()
	{
		return"Number is Zero";
	}
}




public class Q5 {

	public static void main(String[] args) 
	{
		
		    Scanner scanner = new Scanner(System.in);
		    int num = scanner.nextInt();
		    try
		    {
		    	if(num == 0) 
		    	{
		    		throw new ZeroException();
		    	}
		    	int factorial = 1;
		    	for(int i = 1; i <= num; i++) 
		    	{
		    		factorial *= i;
		    	}
		      System.out.println("Factorial: " + factorial);
		    } 
		    catch (Exception e)
		    {
		    	System.out.println(e);
		    }
		  

	}

}
