class demo
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Add = "+c);
	}
	void add(int p,float q)
	{
		float g;
		g=p+q;
		System.out.println("Add = "+g);
	}
	void add(int x,int y,int z)
	{
		int e=x+y+z;
		System.out.println("Add = "+e);
	}
	public static void main(String str[])
	{
		demo ob=new demo();
		ob.add(2,9);
		ob.add(4,9.6f);
		ob.add(5,9,2);
	}
}
