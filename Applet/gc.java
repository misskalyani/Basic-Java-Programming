import java.util.*;
class emp
{
	int eno;
	String ename;
	double sal;
	void accept(int eno1,String ename1,double sal1)
	{
		eno=eno1;
		ename=ename1;
		sal=sal1;
	}
	void disp()
	{
		System.out.println("Emp no = "+eno);
		System.out.println("Emp name = "+ename);
		System.out.println("Emp Salary = "+sal);
	}
	protected void finalize()
	{
	  System.gc();
	  System.out.println("Memory Freee.....");
	}
	public static void main(String arg[])
	{
		emp ob=new emp();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter eno = ");
		int eno=sc.nextInt();
		System.out.println("Enter ename = ");
		String ename=sc.next();
		System.out.println("Enter salary = ");
		double sal=sc.nextDouble();
		ob.accept(eno,ename,sal);
		ob.disp();
	}
}
