import java.util.*;
class emp
{
	int eno;
	String name;
	float sal;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter eno = ");
		eno=sc.nextInt();
		System.out.println("Enter ename = ");
		name=sc.next();
		System.out.println("Enter salary = ");
		sal=sc.nextFloat();
	}
	void disp()
	{
		System.out.println("eno = "+eno);
		System.out.println("ename = "+name);
		System.out.println("salary = "+sal);
	}
	public static void main(String arg [])
	{
		emp e=new emp();
		e.accept();
		e.disp();
	}
}
