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
		  System.out.println("Error = "+e);
		}
	}
}
