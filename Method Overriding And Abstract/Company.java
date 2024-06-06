import java.util.*;
abstract class Staff
{
	String member_name,address;
	abstract void disp();
}
class FullTimeStaff extends Staff
{
	float sal;
		String dept;
	FullTimeStaff(String member_name,String address,String dept,float sal)
	{
		this.member_name=member_name;
		this.address=address;
		this.dept=dept;
	  this.sal=sal;
	}
	void disp()
	{
		System.out.println("\n"+member_name+"\t\t"+address+"\t\t"+dept+"\t\t\t"+sal+"\t\t");
	}
}
class PartTimeStaff extends Staff
{
	int no_of_hr,rate_per_hr;
	PartTimeStaff(String member_name,String address,int no_of_hr,int rate_per_hr)
	{
		this.member_name=member_name;
		this.address=address;
		this.no_of_hr=no_of_hr;
		this.rate_per_hr=rate_per_hr;
	}
	void disp()
	{
		System.out.println("\n"+member_name+"\t\t"+address+"\t\t"+no_of_hr+"\t\t"+rate_per_hr+"\t\t"+(no_of_hr*rate_per_hr)+"\t\t");
	}
}
class Mdemo
{
	public static void main(String arg[])
	{
	  int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. Of Staff Members ");
		int n=sc.nextInt();
		
		
		FullTimeStaff ob[]=new FullTimeStaff[n];
		PartTimeStaff ob1[]=new PartTimeStaff[n];
		
		do
		{
			System.out.println("\n1-FullTimeStaff\n2-PartTimeStaff\n");
			System.out.println("Enter Choice ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:for(int i=0;i<n;i++)
				       {
				       		System.out.print("Enter Staff Member Name = ");
				       		String name=sc.next();
				       		System.out.print("Enter Address = ");
				       		String add=sc.next();
				       		System.out.print("Enter Department Name = ");
				       		String dept=sc.next();
				       		System.out.print("Enter Salary = ");
				       		float sal=sc.nextFloat();
				       		ob[i]=new FullTimeStaff(name,add,dept,sal);
				       }
				       System.out.println("\n\nName\t\tAddress\t\tDepartment\t\tSalary");
				       for(int i=0;i<n;i++)
				       {
				       		ob[i].disp();
				       }
				       break;
				case 2:for(int i=0;i<n;i++)
				       {
				       		System.out.print("Enter Staff Member Name = ");
				       		String name=sc.next();
				       		System.out.print("Enter Address = ");
				       		String add=sc.next();
				       		System.out.print("Enter No. Of Hours = ");
				       		int hr=sc.nextInt();
				       		System.out.print("Enter Rate Per Hour = ");
				       		int rate=sc.nextInt();
				       		ob1[i]=new PartTimeStaff(name,add,hr,rate);
				       }
				       System.out.println("\n\nName\t\tAddress\t\tHours\t\tRate\t\tSalary");
				       for(int i=0;i<n;i++)
				       {
				       		ob1[i].disp();
				       }       
				       break;
			}
		}while(ch<4);
	}
}
