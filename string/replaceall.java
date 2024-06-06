class demo
{
	public static void main(String []arg)
	{
		String s1="cdj clg,rbnb clg,jts clg";
		String s2=s1.replaceAll("clg","school");
		System.out.println("original string = "+s1);
		System.out.println("replaceAll string = "+s2);
	}
}
