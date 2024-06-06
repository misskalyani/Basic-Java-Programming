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
	  emp ob=new emp(12,"om",2000000);
	  ob.disp();
	}
}

