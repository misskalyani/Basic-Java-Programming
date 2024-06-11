class demo
{
	public static void main(String arg[])
	{
	  try
	  {
	  	  int b=4/0;
		  String s1 ="kalyani13";
		  int n=Integer.parseInt(s1);
		  System.out.println("Length = "+n);//NumberFormatException
		}
		catch(Exception e)
		{
		  System.out.println(e.getMessage());
		}
	}
}
