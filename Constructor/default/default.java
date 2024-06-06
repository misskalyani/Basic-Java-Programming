import java.util.*;
class emp
{
	int eno;
	String ename;
	double sal;
	emp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter eno = ");
		this.eno=sc.nextInt();
		System.out.println("Enter ename = ");
		this. ename=sc.next();
		System.out.println("Enter salary = ");
		this. sal=sc.nextDouble();
	}
	void disp()
	{
    System.out.println("\n"+eno+"\t\t"+ename+"\t\t"+sal+"\t\t");
	}
	public static void main(String arg[])
	{
		emp ob=new emp();
		System.out.println("\neno\t\tename\t\tsalary\t\t");
		ob.disp();
	}
}
