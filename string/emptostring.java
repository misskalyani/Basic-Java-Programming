class emp
{
	int id;
	String ename;
	double sal;
	emp(int id,String ename,double sal)
	{
		this.id=id;
		this.ename=ename;
		this.sal=sal;
	}
	public String toString()
	{
		return"\nId = "+id+"\nName = "+ename+"\nSalary = "+sal;
	}
	public static void main(String arg[])
	{
		emp ob=new emp(123,"Om",8900000);
	        System.out.println(ob);
	        emp ob1=new emp(78,"Sai",780000);
	        System.out.println(ob1);
	        emp ob2=new emp(567,"sham",34000000);
	        System.out.println(ob2);
	}
}
