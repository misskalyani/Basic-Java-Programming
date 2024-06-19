//display file data
import java.io.*;
class demo
{
	public static void main(String a[])
	{
		try
		{
			FileInputStream f1=new FileInputStream("abc.txt");
			int k;
			while(true)
			{
				k=f1.read();
				if(k==-1)
				break;
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
