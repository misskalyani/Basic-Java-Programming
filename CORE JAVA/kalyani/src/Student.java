import Student.StudentPer;
import java.util.*;
public class Student 
{

	public static void main(String[] args) 
	{
		String nm, clas;
		int roll;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roll no:= ");
		roll = sc.nextInt();
		System.out.print("Enter Name:= ");
		nm = sc.next();
		System.out.print("Enter class:= ");
		clas= sc.next();
		int m1,m2,m3,m4,m5,m6;
		System.out.print("Enter 6 sub mark:= ");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		m5 = sc.nextInt();
		m6 = sc.nextInt();
		StudentPer ob=new StudentPer(roll, nm, clas, m1, m2, m3, m4, m5, m6);
		ob.display();
		sc.close();
	}

}
