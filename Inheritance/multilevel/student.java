import java.util.*;
class student
{ 
  int rno;
  String s;
  Scanner sc=new Scanner(System.in);
	void accepts()
	{
		System.out.println("Enter Roll NO");
		rno=sc.nextInt();
		System.out.println("Enter Student Name");
		s=sc.next();
	}	
}
class exam extends student
{ 
  float s1,s2,s3,s4,s6,s5;
	void acceptm()
	{
		System.out.println("Enter First Subject Marks");
		s1=sc.nextFloat();
		System.out.println("Enter Second Subject Marks");
		s2=sc.nextFloat();
		System.out.println("Enter Third Subject Marks");
		s3=sc.nextFloat();
		System.out.println("Enter Fourth Subject Marks");
	  s4=sc.nextFloat();
		System.out.println("Enter Fifth Subject Marks");
		s5=sc.nextFloat();
		System.out.println("Enter Sixth Subject Marks");
		s6=sc.nextFloat();
	}	
}
class result extends exam
{ 
  float per,t;
	void calculate()
	{
		t=s1+s2+s3+s4+s5+s6;
		per=t/6;
	}
	void disp()
	{
		System.out.println("Roll No="+rno);
		System.out.println("Student name ="+s);
		System.out.println("Total Marks ="+t);
		System.out.println("percent ="+per);
	}
}
class Mdemo
{
  public static void main(String arg[])
  {
	  result ob=new result();
	  ob.accepts();
	  ob.acceptm();
	  ob.calculate();
	  	ob.disp();
	}  
}
