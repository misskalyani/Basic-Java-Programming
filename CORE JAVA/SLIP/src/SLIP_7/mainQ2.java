package SLIP_7;
import java.io.*;
//Q2) Write a program to accept a text file from user and display the contents of a file in
//reverse order and change its case.
import java.util.*;
public class mainQ2 
{

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter File Name ");
		String file=sc.next();
		FileReader f=new FileReader(file);
		BufferedReader br=new BufferedReader(f);
		String s1=" ";
		while((s1=br.readLine())!=null)
		{
			String s2[]=s1.split(" ");
			for(int i=0;i<s2.length;i++)
			{
				StringBuffer sbr=new StringBuffer(s2[i]);
				sbr.reverse();
				System.out.println(sbr.toString().toUpperCase());
				System.out.println(sbr.toString().toLowerCase());
			}
			System.out.println("");
		}
		f.close();

	}

}
/*OUTPUT:
 * Enter File Name 
abc.txt
IIIH
iiih

OLLEH
olleh

EMOCLEW
emoclew

DOOG
doog

EYB
eyb*/
