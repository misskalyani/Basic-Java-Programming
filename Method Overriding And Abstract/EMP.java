import java.util.*;
class emp
{
	int id,sal;
	String name,dept;
	Scanner sc=new Scanner(System.in);
	emp()
	{
		id=1;
		name="om";
		dept="computer";
	}
	emp(int id,String name,String dept,int sal)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
	}
	void accept()
	{
		System.out.print("Enter Id = ");
		id=sc.nextInt();
		System.out.print("Enter Name = ");
		name=sc.next();
		System.out.print("Enter Deptartment = ");
		dept=sc.next();
		System.out.print("Enter Salary = ");
		sal=sc.nextInt();
	}
	void disp()
	{
	  System.out.println("Id = "+id);
	   System.out.println("Name = "+name);
	   System.out.println("Department = "+dept); 
	  System.out.println("Salary = "+sal);  
	}
}
class manager extends emp
{
	int bonus,sal;
	manager()
	{
		bonus=7800;
	}
	manager(int bonous)
	{
	  this.bonus=bonus;
	}
	void acceptm()
	{
	  System.out.print("Enter Bonus = ");
	  bonus=sc.nextInt();
	}
	void dispm()
	{
	  System.out.println("bonus = "+bonus);
	}
}
class Md
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter Limit = ");
		int n=sc.nextInt();
		manager ob[]=new manager[n];
		for(int i=0;i<n;i++)
		{
			ob[i]=new manager();
			ob[i].accept();
			ob[i].acceptm();
			
		}
		int max=ob[0].sal+ob[0].bonus;
		int index=0;
		for(int i=1;i<n;i++)
		{
			if((ob[i].sal+ob[i].bonus)>max)
			{
				max=ob[i].sal+ob[i].bonus;
				index=i;
			}
		}
		ob[index].disp();
		ob[index].dispm();
	}
}
