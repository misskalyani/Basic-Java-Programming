import java.io.*;
import java.util.*;
class demo
{
	public static void main(String ar[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Source File");
		String s1=sc.nextLine();
		
		System.out.println("Enter Destination File");
		String s2=sc.nextLine();
		
		FileReader f1 =new FileReader(s1);
		FileWriter f2=new FileWriter(s2);
		
		BufferedReader br=new BufferedReader(f1);
		BufferedWriter bw=new BufferedWriter(f2);
		
		String s="";
		while((s=br.readLine())!=null)
		{
			bw.write(s+"\n");	
		}
		bw.write("Comment:End Of File");
		br.close();
		bw.close();
		f1.close();
		f2.close();
		System.out.println("File Copy Succesffuly");
	}
}
