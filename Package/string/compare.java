package string;
public class compare
{
	public void Compare(String s1,String s2)
	{
		
		int k=s1.compareTo(s2);
		if(k==0)
		{
			System.out.println("Strings Are Same");
		}
		if(k>0)
		{
			System.out.println("String1 Greater");
		}
		if(k<0)
		{
			System.out.println("String2 Greater");
		}
	}
}
