import java.util.*;
class InvalidDataException extends Exception
{
	public String toString()
	{
		return "Invalid Pan Number or Mobile";
	}
}
class pan
{
	public static void main(String ar[])
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter PAN Number = ");
			String pan =sc.next();
			System.out.print("Enter Phone Number = ");
			String phone =sc.next();
		}
	}
}
