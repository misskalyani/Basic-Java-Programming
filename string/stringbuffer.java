class string
{
	public static void main(String arg[])
	{
		StringBuffer s=new StringBuffer("kalyani");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		StringBuffer s=new StringBuffer("ammu");
		s.append("chaudhari");
		s.append("piyu");
		System.out.println("After Append = "+s);
		
				StringBuffer s=new StringBuffer("shhhh");
				s.insert(2,"ammm");
				s.insert(3,"kaaaa");
			System.out.println("After Insert = "+s);
		  s.deleteCharAt(3);
		  System.out.println("After Delete = "+s);
		
	}
}
