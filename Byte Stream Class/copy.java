import java.io.*;
class demo
{
	public static void main(String ar[])throws Exception
	{
		FileInputStream f1=new FileInputStream("abc.txt");
		FileOutputStream f2=new FileOutputStream("std.txt");
		int k;
		while((k=f1.read())!=-1)
		{
			f2.write(k);
		}
		f1.close();
		f2.close();
		System.out.println("File copy Succesfulyy.....");
	}
}
