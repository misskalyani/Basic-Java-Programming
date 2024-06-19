import java.io.*;
class demo
{ 
	public static void main(String ar[]) throws Exception
	{
		FileReader f =new FileReader("abc.txt");
		FileWriter f1=new FileWriter("xyz.txt");
		BufferedReader br =new BufferedReader(f);
		BufferedWriter bw=new BufferedWriter(f1);
		String s=" ";
		while((s=br.readLine())!=null)
		{
			bw.write(s+"\n");
		}
		br.close();
		bw.close();
		f.close();
		f1.close();
		System.out.println("File Copy Successfully......");
	}
}
