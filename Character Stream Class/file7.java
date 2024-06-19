//Reversae content of the file
import java.io.*;
class demo
{
	public static void main(String ar[])
	{
		FileReader f=new FileReader("abc.txt");
		BufferedReader br =new BufferedReader(f);
		String s=" ";
		StringBuffer sb=new StringBuffer();
		while((s=br.readLine())!=null)
		{
			sb.append(s+"\n");
		}
		sb.reverse();
		System.out.println(sb);
		f.close();
	}
} 
