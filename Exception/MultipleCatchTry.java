class demo
{
	public static void main(String arg[])
	{
	  try
	  {
		  String s1 ="kalyani13";
		  int n=Integer.parseInt(s1);
		  System.out.println("Length = "+n);//NumberFormatException
	  }
	  catch(Exception e)
	  {
		  System.out.println(e.getMessage());
          }
	 try
	  {
	  	int a=6;
	  	int b=a*a;
	  	System.out.println("Square = "+b);
	  }
	  catch(Exception e)
	  {
		  System.out.println(e.getMessage());
	  }
	}
}
