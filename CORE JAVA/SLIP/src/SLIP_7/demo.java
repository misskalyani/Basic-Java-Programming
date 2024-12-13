package SLIP_7;
import java.io.*;
public class demo {


	//Q2) Write a program to accept a text file from user and display the contents of a file in
	//reverse order and change its case.
	
	
		public static void main(String ar[])throws Exception
		{
			FileReader f1=new FileReader("xyz.txt");
			BufferedReader br=new BufferedReader(f1);
			String s1=" ";
			while((s1=br.readLine())!=null)
			{
				System.out.println(s1);
			}
			f1.close();
		}
}
