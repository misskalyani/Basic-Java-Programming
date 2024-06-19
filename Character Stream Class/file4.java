import java.io.*;
class demo
{
	public static void main(String a[]) throws Exception
	{
		FileReader f=new FileReader("file.java");
		BufferedReader br=new BufferedReader(f);
		String s1=" ";
		while((s1=br.readLine())!=null)
		{
			String s2[]=s1.split(" ");
			for(int i=0;i<s2.length;i++)
			{
				StringBuffer sbr=new StringBuffer(s2[i]);
				sbr.reverse();
				System.out.print(sbr+" ");
			}
			System.out.println("");
		}
		f.close();
	}
}
