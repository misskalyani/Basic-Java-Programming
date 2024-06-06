import java.util.*;
class person
{
	int pid,age;
	String pname,g;
	person()
	{
		pid=12345677;
		pname="sai";
		age=20;
		g="male";
	}
	person(int pid,String pname,int age,String g)
	{
		this.pid=pid;
		this.pname=pname;
		this.age=age;
		this.g=g;
	}
	void disp()
	{
		System.out.println(pid+"\t\t"+pname+"\t\t"+age+"\t\t"+g+"\t\t");
	}
	public static void main(String arg[])
	{
	   person ob1[]=new person[5];
	  Scanner sc=new Scanner(System.in);
	  for(int i=0;i<5;i++)
	  {
	     
		    System.out.println("Ebter pid = ");
		    int pid=sc.nextInt();
		    System.out.println("Ebter name = ");
		    String pname=sc.next();
		    System.out.println("Ebter age = ");
		    int age=sc.nextInt();
		    System.out.println("Ebter gender = ");
		    String g=sc.next();
		    ob1[i]=new person(pid,pname,age,g);//calling pc
		}
		System.out.println("pid\t\tpname\t\tage\t\tgender\t\t");
		for(int i=0;i<5;i++)
		{
		    ob1[i].disp();
		}
	}
}
