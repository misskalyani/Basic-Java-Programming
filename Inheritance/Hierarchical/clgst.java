import java.util.*;
class college
{
	int cno;
	String cname,add;
	Scanner sc=new Scanner(System.in);
	void acceptc()
	{
		System.out.println("Enter College no = ");
		cno=sc.nextInt();
		System.out.println("Enter College name = ");
		cname=sc.next();
		System.out.println("Enter College Address = ");
		add=sc.next();
	}
	void dispc()
	{
		System.out.println("College no = "+cno);
		System.out.println("College name = "+cname);
		System.out.println("College Address = "+add);
	}

}
class student extends college
{
	int rno;
	String sname;
	float per;
	void accepts()
	{
		System.out.println("Enter Student Rollno = ");
		rno=sc.nextInt();
		System.out.println("Enter student name = ");
		sname=sc.next();
		System.out.println("Enter Percentage = ");
		per=sc.nextFloat();
	}
	void disps()
	{
		System.out.println("Student rollno = "+rno);
		System.out.println("Student name = "+sname);
		System.out.println("Percentage = "+per);
	}
}
class teacher extends college
{
	int tno;
	String tname;
	float sal;
	void acceptt()
	{
		System.out.println("Enter teacher no = ");
		tno=sc.nextInt();
		System.out.println("Enter Teacher name = ");
		tname=sc.next();
		System.out.println("Enter Salary = ");
		sal=sc.nextFloat();
	}
	void dispt()
	{
		System.out.println("Teacher No = "+tno);
		System.out.println("Teacher name = "+tname);
		System.out.println("Salary = "+sal);
	}	
}
class Mdemo
{
	public static void main(String arg[])
	{
		student ob=new student();
		ob.acceptc();
		ob.accepts();
		ob.dispc();
		ob.disps();
		teacher ob1=new teacher();
		ob1.acceptc();
		ob1.acceptt();
		ob1.dispc();
		ob1.dispt();
	}
}
