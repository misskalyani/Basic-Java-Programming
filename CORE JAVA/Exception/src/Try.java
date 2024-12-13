import java.io.*;
public class Try {

	public static void main(String[] args) {
		try
		{
			DataInputStream dis=new DataInputStream(System.in);
			System.out.println("Enter Name = ");
			String name = dis.readLine();
			System.out.println("Name = "+name);
		}
		catch(Exception e1)
		{
			System.out.println("Error = "+e1);
		} 	
	}

}
