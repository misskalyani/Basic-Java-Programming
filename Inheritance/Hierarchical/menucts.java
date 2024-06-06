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
	  teacher ob1=new teacher();
	  Scanner sc1=new Scanner(System.in);
		int ch;
		do
		{
		  System.out.println("\n1-College student info\n2-college teacher info\n3-Student Teacher same College ");
		  System.out.println("Enter Choice =");
		  ch=sc1.nextInt();
		  switch(ch)
		  {
		      case 1:	
		             ob.acceptc();
		             ob.accepts();
		             ob.dispc();
		             ob.disps();
		             break;
		      case 2:
		             ob1.acceptc();
		             ob1.acceptt();
		             ob1.dispc();
		             ob1.dispt();  
		             break;
		      case 3:
		             ob.acceptc();
		             ob.accepts();
		             ob1.acceptt();
		             ob.dispc();
		             ob.disps();
		             ob1.dispt();
		             break;
		    }
		}while(ch<6);
		
	}
}
