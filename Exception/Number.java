class demo
{
	public static void main(String arg[])
	{
	  try
	  {
		  //int n=Integer.parseInt(null);
		   int n=Integer.parseInt("kalyani");
		  System.out.println("Value = "+n);//NumberFormatException
		}
		catch(Exception e)
		{
		  System.out.println("Error = "+e.getMessage());
		}
	}
}
