import java.util.*;
class student
{
	int rno;
	String name;
	float per;
	student()
	{
		rno=101;
		name="om";
		per=45.9f;
	}
	student(int rno,String name,float per)
	{
		this.rno=rno;
		this.name=name;
		this.per=per;
	}
	void disp()
	{
		System.out.println(rno+"\t\t"+name+"\t\t"+per+"\t\t");
	}
	public static void main(String []arg)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter limit = ");
	    int n=sc.nextInt();
	    student ob[]=new student[n];
	    for(int i=0;i<n;i++)
	    {
	      System.out.println("enter rollno = ");
	      int rno=sc.nextInt();
	      System.out.println("enter name = ");
	      String name=sc.next();
	      System.out.println("enter per = ");
	      float per=sc.nextFloat();
	      ob[i]=new student(rno,name,per);
	    }
	      System.out.println("rno\t\tname\t\tper\t\t");
	    for(int i=0;i<n;i++)
	    {
	      ob[i].disp();
	    }
	}
}
