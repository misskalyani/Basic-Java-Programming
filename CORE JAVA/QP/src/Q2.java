// Write a Java program to copy content from one file into another file,while copying digits are replaced by '*'.

import java.io.*;
public class Q2 {

	public static void main(String[] args) throws Exception
	{
		FileInputStream f1=new FileInputStream("demo.txt");
		FileOutputStream f2=new FileOutputStream("abc.txt");
		int k;
		while((k=f1.read())!=-1)
		{
			if (Character.isDigit((char)k))
			{
				f2.write('*');
			}
			else
			{
				f2.write(k);
			}
		}
		f1.close();
		f2.close();
		System.out.println("File copy Succesfulyy.....");
	}

}
