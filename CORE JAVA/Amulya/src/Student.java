import SY.*;
import TY.*;
import java.util.*;

public class Student 
{
	int rno;
	String name;
	SYmarks sy;
	TYmarks ty;
	double per;
	char grade;
	Student(int rno,String name,int ct,int mt,int et,int Theory,int Practicals)
	{
		sy=new SYmarks(ct, mt, et);
		ty=new TYmarks(Theory, Practicals);
		this.rno=rno;
		this.name=name;
		perCalc(ct, mt, et, Theory, Practicals);
		Grade();
	}
	void perCalc(int ct,int mt,int et,int Theory,int Practicals)
	{
		this.per=(double)(ct+mt+et+Theory+Practicals)/5;
	}
	
	void Grade()
	{
		if(per>=70)
			grade='A';
		else if(per>=60)
			grade='B';
		else if(per>=50)
			grade ='C';
		else if(grade>=40)
			grade='D';
		else
			grade='F';
	}
	void disp()
	{
		System.out.println(rno+name+sy+ty+per+grade);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit ");
		int n=sc.nextInt();
		Student ob[]= new Student[n];
		for (int i =0;i<n;i++)
		{
			System.out.println("Enter roll no :: ");
			int r=sc.nextInt();
			System.out.println("Enter Name :: ");
			String nm=sc.next();
			System.out.println("Enter Computer Marks :: ");
			int c=sc.nextInt();
			System.out.println("Enter MAth MArks");
			int m=sc.nextInt();
			System.out.println("Enter Eletronic marks");
			int e=sc.nextInt();
			System.out.println("Enter Theory marks");
			int t=sc.nextInt();
			System.out.println("Enter Practal marks");
			int p=sc.nextInt();
			ob[i]=new Student(r, nm, c, m, e, t, p);
			ob[i].disp();
		}
		
	
	}

}
