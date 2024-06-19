import series.*;
import java.util.*;
class demo
{
	public static void main(String ar[])
	{
	  fibonacci ob=new fibonacci();
	  cube ob1=new cube();
	  square ob2=new square();
	  Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Any Number = ");
	  int n=sc.nextInt();
	  ob.print(n);
	   ob1.print(n);
	    ob2.print(n);
	  
	}
}
