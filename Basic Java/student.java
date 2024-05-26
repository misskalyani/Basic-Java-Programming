import java.util.*;
class student
{
	int sno;
	String name;
	float mark;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sno = ");
		sno=sc.nextInt();
		System.out.println("Enter name = ");
		name=sc.next();
		System.out.println("Enter marks = ");
		mark=sc.nextFloat();
	}
	void disp()
	{
		System.out.println("sno = "+sno);
		System.out.println("name = "+name);
		System.out.println("marks = "+mark);
	}
	public static void main(String arg [])
	{
		student s=new student();
		s.accept();
		s.disp();
	}
}
