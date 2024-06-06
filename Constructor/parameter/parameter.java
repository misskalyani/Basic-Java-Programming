import java.util.*;
class emp
{
	int eno;
	String ename;
	double sal;
	emp(int eno,String ename,double sal)
	{
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
	}
	void disp()
	{
    System.out.println("\n"+eno+"\t\t"+ename+"\t\t"+sal+"\t\t");
	}
	public static void main(String arg[])
	{
    Scanner sc=new Scanner(System.in);
		emp ob[]=new emp[10];
		System.out.println("Enter no of emp = ");
		int n=sc.nextInt();
		System.out.println("Enter eno = ");
		int eno=sc.nextInt();
		System.out.println("Enter ename = ");
		String ename=sc.next();
		System.out.println("Enter salary = ");
		double sal=sc.nextDouble();
		for(int i=0;i<n;i++)
		{
		    ob[i]=new emp(eno,ename,sal);
		 
		}
		System.out.println("\neno\t\tename\t\tsalary\t\t");
		for(int i=0;i<n;i++)
		{
		  ob[i].disp();
		}
	}
}
