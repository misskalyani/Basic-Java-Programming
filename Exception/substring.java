class demo
{
	public static void main(String arg[])
	{
	  try
	  {
		  String s1 ="kalyani";
		  System.out.println("Length = "+s1.substring(8,10));//StringIndexOutOfBoundsException
	  }
	  catch(Exception e)
	  {
		  System.out.println("Error = "+e);
	  }
	}
}
