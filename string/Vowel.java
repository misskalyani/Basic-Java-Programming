class demo
{
	public static void main(String []arg)
	{
		String s1=new String("Shrirampur");
		System.out.println(s1);
		System.out.println("Vowels");
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' ||s1.charAt(i)=='i'||s1.charAt(i)=='o' ||s1.charAt(i)=='u')
			{
				System.out.print(s1.charAt(i));
			}
		}
	}
}
