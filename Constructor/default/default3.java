class emp
{
	int eno;
	String ename;
	float sal;
	emp()
	{
		eno=345;
		ename="Om";
		sal=34000000;
		System.out.println("Eno = "+eno);
		System.out.println("Ename = "+ename);
		System.out.println("ESal = "+sal);
	}
	public static void main(String arg[])
	{
		emp ob=new emp();
	}
}
