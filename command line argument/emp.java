class demo
{
	public static void main(String []arg)
	{
		int eno=Integer.parseInt(arg[0]);
		String ename=arg[1];
		float sal=Float.parseFloat(arg[2]);
		String dep=arg[3];
		System.out.println("eno\t\tename\t\tsal\t\tdept\t\t");
		System.out.println(+eno+"\t\t"+ename+"\t\t"+sal+"\t\t"+dep+"\t\t");
	}
}
