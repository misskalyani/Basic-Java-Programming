//dispaly file data
import java.io.*;
class file
{
	public static void main(String ar[])
	{
		try
		{
		FileInputStream f1=new FileInputStream("abc.txt");
		int k;
		while((k=f1.read())!=-1)
		{
			System.out.print((char)k);
		}
		f1.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}



	 
