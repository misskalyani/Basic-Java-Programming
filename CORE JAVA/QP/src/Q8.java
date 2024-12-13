//a) Write a java program to copy the content from one file to another file,while copying change the case of alphabets.
import java.io.*;
public class Q8 {

	public static void main(String[] args) throws Exception
	{
		FileInputStream f1=new FileInputStream("demo.txt");
		FileOutputStream f2=new FileOutputStream("abc.txt");
		int k;
		while((k=f1.read())!=-1)
		{
			
			if(Character.isUpperCase((char)k))
			{
				f2.write(Character.toUpperCase((char)k));
			}
			else
			{
				f2.write(Character.toLowerCase((char)k));
			}
			
		}
		f1.close();
		f2.close();
		System.out.println("File copy Succesfulyy.....");
	}


}

