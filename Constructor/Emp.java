import java.util.*;
class emp
{
	int eno;
	String ename;
	double sal;
	emp(int eno1,String ename1,double sal1)
	{
		eno=eno1;
		ename=ename1;
		sal=sal1;
	}
	void disp()
	{
    System.out.println("\n"+eno+"\t\t"+ename+"\t\t"+sal+"\t\t");
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter eno = ");
		int eno=sc.nextInt();
		System.out.println("Enter ename = ");
		String ename=sc.next();
		System.out.println("Enter salary = ");
		double sal=sc.nextDouble();
		emp ob=new emp(eno,ename,sal);
		System.out.println("\neno\t\tename\t\tsalary\t\t");
		ob.disp();
	}
}
