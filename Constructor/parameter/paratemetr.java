import java.util.*;
class emp
{
	int eno;
	String ename;
	float sal;
	emp(int eno,String ename,float sal)
	{
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
	}
	void disp()
	{
		System.out.println("eno\tename\tsal\t");
		System.out.println(eno+"\t"+ename+"\t"+sal+"\t");
		
	}
	public static void main(String arg[])
	{
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter eno = ");
	  int eno=sc.nextInt();
	  System.out.println("Enter ename = ");
	  String ename=sc.next();
	  System.out.println("Enter sal = ");
	  float sal=sc.nextFloat();
	  emp ob=new emp(eno,ename,sal);
	  ob.disp();
	}
}

