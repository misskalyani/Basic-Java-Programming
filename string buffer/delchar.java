class demo
{
	public static void main(String []arg)
	{
		StringBuffer s=new StringBuffer("shrirampur");
		System.out.println("String ="+s);
		s=s.deleteCharAt(2);
		System.out.println("delete String ="+s);
	}
}
