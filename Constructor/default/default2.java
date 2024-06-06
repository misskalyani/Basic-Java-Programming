import java.util.*;
class emp
{
	int eno;
	String ename;
	float sal;
	emp()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter eno = ");
		eno=sc.nextInt();
		System.out.println("Enter ename = ");
		ename=sc.next();
		System.out.println("Enter sal = ");
		sal=sc.nextFloat();
		System.out.println("eno\tename\tsal\t");
		System.out.println(eno+"\t"+ename+"\t"+sal+"\t");
		
	}
	public static void main(String arg[])
	{
	  emp ob=new emp();
	}
}

