package SLIP_7;
import java.io.*;
//Q2) Write a program to accept a text file from user and display the contents of a file in
//reverse order and change its case.
public class Q2 
{

	public static void main(String ar[])throws Exception
	{
		FileWriter f1=new FileWriter("xyz.txt");
		f1.write("Hiii");
		f1.write("\nHello");
		f1.write("\nWelcome");
		f1.write("\nByeee");
		f1.write("\ngood");
		f1.close();
	}

}
 
