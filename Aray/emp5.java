import java.util.*;
class emp
{
	int eno,n;
	String ename;
	float sal;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
			System.out.print("Enter eno = ");
			eno=sc.nextInt();
			System.out.print("Enter ename = ");
			ename=sc.next();
			System.out.print("Enter salary = ");
			sal=sc.nextFloat();
	}
	void disp()
	{
			System.out.print("\neno = "+eno);
			System.out.print("\nename = "+ename);
			System.out.print("\nsalary = "+ename);

	}
	public static void main(String ar[])
	{
	  int i;
		emp ob=new emp();
		for(i=0;i<5;i++)
		{
		    ob.accept();
		}
		for(i=0;i<5;i++)
		{
	  	ob.disp();
	  }	
	}
	
}
