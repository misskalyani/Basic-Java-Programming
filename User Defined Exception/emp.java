import java.util.*;
class InvalidAgeException extends Exception
{
	public String toString()
	{
		return"Invalid Employe Age Exception";
	}
}
class emp
{
	int eno,sal,age;
	String name;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Eno = ");
		eno=sc.nextInt();
		System.out.print("Enter Ename = ");
		name=sc.next();
		System.out.print("Enter Age = ");
		age=sc.nextInt();
		System.out.print("Enter salary = ");
		sal=sc.nextInt();
	}
	void disp()
	{
		
		try
		{
			if(age<=18)
			{
				throw new InvalidAgeException();
			}
			System.out.print("\nEno = "+eno);
			System.out.print("\nEname = "+name);
			System.out.print("\nAge = "+age);
			System.out.print("\nsalary = "+sal);
		}
		catch(InvalidAgeException e)
		{
			System.out.println("User Definde Error = "+e);
		}
	}
	public static void main(String arg[])
	{
		  emp ob =new emp();
		  ob.accept();
		  ob.disp();
	}
}
