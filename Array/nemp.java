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
			System.out.print( "\n"+eno);
			System.out.print( "\t"+ename);
			System.out.print( "\t"+sal);

	}
	public static void main(String ar[])
	{
	  int i;
		emp ob[]=new emp[10];
		Scanner s=new Scanner(System.in);
		System.out.print("\nenter no of emp = ");
		int n=s.nextInt();
		for(i=0;i<n;i++)
		{
		    ob[i]=new emp();
		    ob[i].accept();
		}
		for(i=0;i<n;i++)
		{
	  	ob[i].disp();
	  }	
	}
	
}
