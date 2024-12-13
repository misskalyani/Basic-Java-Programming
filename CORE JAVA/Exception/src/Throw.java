import java.io.*;
public class Throw {
//DataInputStream la throw kiva try catch use karav lagta nahi tr error show hoteerty  
	public static void main(String[] args) throws Exception
	{
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
