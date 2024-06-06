import java.util.*;
abstract class Staff
{
	int id;
	String name;
	Staff(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
}
class OfficeStaff extends Staff
{
	String dept;
	OfficeStaff(int id,String name,String dept)
	{
		super(id,name);
		this.dept=dept;
	}
	void disp()
	{
		System.out.println("\n"+id+"\t\t"+name+"\t\t"+dept+"\t\t");
	}
}
class Md
{
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Limit = ");
      int n=sc.nextInt();
      OfficeStaff ob[]=new OfficeStaff[n];
      for(int i=0;i<n;i++)
      {
        System.out.print("Enter Id = ");
        int id=sc.nextInt();
        System.out.print("Enter Name = ");
        String name =sc.next();
        System.out.print("Enter Department = ");
        String dept=sc.next();
        ob[i]=new OfficeStaff(id,name,dept);
        
      }
      System.out.println("\n\nId\t\tName\t\tDepartment\t\t");
      for(int i=0;i<n;i++)
      {
        ob[i].disp();
      }
    }
}

