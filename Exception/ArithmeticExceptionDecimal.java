import java.math.BigDecimal;
class demo
{
	public static void main(String ar[])
	{
		try
		{
			BigDecimal a1=new BigDecimal(3.4);
			BigDecimal b1=new BigDecimal(6.4);
			a1=a1.divide(b1);//ArithmeticException....Non-Terminating decimal expansion
			System.out.println("Division = "+a1);
		}
		catch(Exception e)
		{
			System.out.println("Error Ocuur.... = "+e);
		}
	}
}
