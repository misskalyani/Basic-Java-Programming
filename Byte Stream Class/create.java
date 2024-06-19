import java.io.*;
import java.util.*;
class demo
{
	public static void main(String ar[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Data");
		String s=sc.nextLine();
		FileOutputStream f2=new FileOutputStream("abc.txt");
		for(int i=0;i<s.length();i++)
		{
		  char ch=s.charAt(i);
			f2.write(ch);
		}
		f2.close();
		System.out.println("File Created Successfully...");
	}
}
