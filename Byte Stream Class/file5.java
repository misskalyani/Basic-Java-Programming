import java.io.*;
import java.util.Scanner;
class demo
{
	public static void main(String ar[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter data ");
		String s=sc.nextLine();
		FileOutputStream f=new FileOutputStream("pqr.txt");
		for(int i=0;i<s.length();i++)
		{
			int ch=s.charAt(i);
			f.write(ch);
		}
		f.close();
	}
}
