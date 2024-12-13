import java.io.*;
public class ThrowTry 
{

	public static void main(String[] args) throws Exception
	{
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("Enter Name = ");
			String name = dis.readLine();
			System.out.println("Name = "+name);
	
	
	}

}
