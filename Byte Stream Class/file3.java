//Create File Enter Values
import java.io.*;
class demo
{
	public static void main(String ar[]) throws Exception
	{
		FileOutputStream f1=new FileOutputStream("pqr.txt");
		int k;
		System.out.println("Enter Data upto ctrl+z");
		while((k=System.in.read())!=-1)
		{
		  f1.write(k);
		}
		f1.close();
		System.out.println("File Copy Successfulyy....");
	}
}
