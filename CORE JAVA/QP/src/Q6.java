//c) Write a Java Program to copy the contents form one file into another file.While copying, change the case of cell the alphabets 
//& replace all the digital by '*'.


import java.io.*;
public class Q6 {

		public static void main(String[] args) throws Exception
		{
			FileInputStream f1=new FileInputStream("demo.txt");
			FileOutputStream f2=new FileOutputStream("abc.txt");
			int k;
			while((k=f1.read())!=-1)
			{
				if (Character.isDigit((char)k))
				{
					f2.write('*');
				}
				else if(Character.isUpperCase((char)k))
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
