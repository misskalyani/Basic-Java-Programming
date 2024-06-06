import java.util.*;
class college
{
	int cno;
	String cname,cadd;
	Scanner sc=new Scanner(System.in);
	void acceptc()
	{
		System.out.println("Enter College No = ");
		cno=sc.nextInt();
		System.out.println("Enter College Name = ");
		cname=sc.next();
		System.out.println("Enter College Address = ");
		cadd=sc.next();
	}
}
class student extends college
{
	int rno;
	String sname;
	float per;
	void accepts()
	{
		System.out.println("Enter Roll No = ");
		rno=sc.nextInt();
		System.out.println("Enter Student Name = ");
		sname=sc.next();
		System.out.println("Enter Percentage = ");
		per=sc.nextFloat();
	
	}
	void disp()
	{
		System.out.println("College No ="+cno);
		System.out.println("College Name ="+cname);
		System.out.println("College Address="+cadd);
		System.out.println("Student Roll No ="+rno);
		System.out.println("Student Name ="+sname);
		System.out.println("Percentage ="+per);
	}
public static void main(String arg[])
{
	student ob=new student();
	ob.acceptc();
	ob.accepts();
	ob.disp();
}
}
