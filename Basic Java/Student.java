import java.util.*;
class student
{
	int rno,m1,m2,m3,m4,m5,m6,t;
	String name;
	float p;
	void accept()
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter Roll Number = ");
	    rno=sc.nextInt();
	    System.out.print("Enter Name = ");
	    name=sc.next();
	    System.out.print("Enter any subject mark = ");
	    m1=sc.nextInt();
	    m2=sc.nextInt();
	    m3=sc.nextInt();
	    m4=sc.nextInt();
	    m5=sc.nextInt();
	    m6=sc.nextInt();
	}
	void calculate()
	{
		t=m1+m2+m3+m4+m5+m6;
		p=(float) t/6;
	}
	void disp()
	{
		System.out.println("Roll Num = "+rno);
		System.out.println("Name = "+name);
		System.out.println("Total Marks  = "+t);
		System.out.println("Percentage = "+p);
	}
	public static void main(String arg[])
	{
	    student ob=new student();
	    ob.accept();
	    ob.calculate();
	    ob.disp();
	}
	
}
