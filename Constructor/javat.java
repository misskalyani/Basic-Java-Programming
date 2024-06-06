import java.util.*;
class teacher
{
	int tid;
	String tname,des,sub;
	float sal;
	teacher(int tid,String tname,String des,float sal,String sub)
	{
		this.tid=tid;
		this.tname=tname;
		this.des=des;
		this.sal=sal;
		this.sub=sub;
	}
	void disp()
	{
		System.out.println(tid+"\t\t"+tname+"\t\t"+des+"\t\t"+sal+"\t\t"+sub+"\t\t");
	}
	public static void main(String arg[])
	{
		teacher ob[]=new teacher[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of teacher");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Teacher id =");
			int tid=sc.nextInt();
			System.out.println("Enter Teacher name =");
			String tname=sc.next();
			System.out.println("Enter Designataion =");
			String des=sc.next();
			System.out.println("Enter Teacher Salary =");
		        float sal=sc.nextFloat();
		        System.out.println("Enter Teacher Subject =");
			String sub=sc.next();
			ob[i]=new teacher(tid,tname,des,sal,sub);
		}
		System.out.println("\n\n\nTid\t\ttname\t\tdesign\t\tsalary\t\tsubject\t\t\n\n");
		for(int i=0;i<n;i++)
		{
		  ob[i].disp();
		}
		System.out.println("\n\n\n\nTid\t\ttname\t\tdesign\t\tsalary\t\tsubject\t\t\n\n");
		for(int i=0;i<n;i++)
		{
			if(ob[i].sub.equals("java"))
			{
				ob[i].disp();
			}	
		}
	}
}
