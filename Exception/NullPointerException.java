class demo
{
	public static void main(String arg[])
	{
	  try
	  {
		  String s1 =null;//NullPointerException
		  System.out.println("Length = "+s1.length());
		}
		catch(Exception e)
		{
		  System.out.println("Error = "+e);
		}
	}
}
