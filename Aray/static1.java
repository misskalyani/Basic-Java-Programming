class Show
{
  static int a=5;
	void show()
	{
		a++;
		System.out.print("Value of a = "+a);
	}
	public static void main(String sr[])
	{
		Show ob=new Show();
		ob.show();
		ob.show();
		ob.show();
		ob.show();
	}
	
}
