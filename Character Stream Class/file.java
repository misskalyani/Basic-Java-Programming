import java.io.*;
class demo
{
	public static void main(String ar[])throws Exception
	{
		FileReader f1=new FileReader("abc.txt");
		BufferedReader br=new BufferedReader(f1);
		String s1=" ";
		while((s1=br.readLine())!=null)
		{
			System.out.println(s1);
		}
	}
}
