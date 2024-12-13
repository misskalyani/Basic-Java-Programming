package SLIP_10_Q2;

public class Student {


		
		/*Q2) Write a program to create a package name student. Define class StudentInfo with method to
		display information about student such as rollno, class, and percentage. Create another class
		StudentPer with method to find percentage of the student. Accept student details like
		rollno, name, class and marks of 6 subject from user.*/

		
			public int rno;
			public String clas,nm;
			public int a,b,c,d,e,f;
			int sum=0;
			double per;
			public void disp()
			{
				System.out.println(rno+"\t"+nm+"\t"+clas);
				System.out.println("\nMarks\nSub1 = "+a+"\nSub2 = "+b);
				System.out.println("sub3 = "+c+"\nSub4 = "+d);
				System.out.println("sub5 = "+e+"\nSub6 = "+f+"\n Total = "+sum+"\nPercentage = "+per);
			}

		}
 class Percent extends Student
		{
			 Percent(int r,String n,String ca,int m1,int m2,int m3,int m4,int m5,int m6)
			{
				rno=r;
				nm=n;
				clas=ca;
				a=m1;
				b=m2;
				c=m3;
				d=m4;
				e=m5;
				f=m6;
				sum=a+b+c+d+e+f;
				per=sum/6;
			}
			
		

	


}
