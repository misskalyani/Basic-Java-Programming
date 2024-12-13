import SLIP_10_Q2.Student.*;
import java.util.*;
public class SLIP_10_Q2 
{

	
	/*Q2) Write a program to create a package name student. Define class StudentInfo with method to
	display information about student such as rollno, class, and percentage. Create another class
	StudentPer with method to find percentage of the student. Accept student details like
	rollno, name, class and marks of 6 subject from user.*/
		public static void main(String[] args) 
		{
			String nm,clas;
			int roll;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Roll no = ");
			roll = sc.nextInt();
			System.out.print("Enter Name = ");
			nm = sc.next();
			System.out.print("Enter class = ");
			clas= sc.next();
			int m1,m2,m3,m4,m5,m6;
			System.out.print("Enter 6 sub mark = ");
			m1 = sc.nextInt();
			m2 = sc.nextInt();
			m3 = sc.nextInt();
			m4 = sc.nextInt();
			m5 = sc.nextInt();
			m6 = sc.nextInt();
			//Percent s = new Percent(roll,nm,clas,m1,m2,m3,m4,m5,m6);
			//s.disp();
			//Student s1=new Student();
			//s1.disp();
		}

	}



