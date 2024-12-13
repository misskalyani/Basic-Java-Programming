import java.io.*;
public class Error {

	public static void main(String[] args) {
		int b=0,c=0,d=0,e=0;
		try
		{
			int a=7;
			b=a-3;
			c=a+8;
			d=a/0;
			e=a*7;
		}
		catch(Exception e1)
		{
			System.out.println("Error = "+e1);
		}
		finally
		{
			System.out.println("Addition = "+b);
			System.out.println("Subtraction = "+c);
			System.out.println("Division = "+d);
			System.out.println("Multiplication = "+e);
		}
	}

}
