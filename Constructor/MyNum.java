class MyNumber
{
	private int n;
	MyNumber()
	{
		n=0;
	}
	MyNumber(int n)
	{
		this.n=n;
	}
	int isnegative()
	{
		if(n<0)
			return 1;
		else
			return 0;
	}
	boolean ispositive()
	{
		if(n>0)
			return true;
		else
			return false;
	}
	boolean iszero()
	{
		if(n==0)
			return true;
		else
			return false;
	}
	boolean iseven()
	{
		if(n%2==0)
			return true;
		else
			return false;
	}
	boolean isodd()
	{
		if(n%2==1)
			return true;
		else
			return false;
	}
	public static void main(String []arg)
	{
		MyNumber ob=new MyNumber();
		if(ob.isnegative()==1)
			System.out.println("Number is Negative");
		if(ob.ispositive())
			System.out.println("Number is Positive");
		if(ob.iszero())
			System.out.println("Number is Zero");
		if(ob.iseven())
			System.out.println("Number is even");
	 if(ob.isodd())
			System.out.println("Number is Odd");
		System.out.println("Calling pc");
		MyNumber ob1=new MyNumber(3);
		if(ob1.isnegative()==1)
			System.out.println("Number is Negative");
		if(ob1.ispositive())
			System.out.println("Number is Positive");
		if(ob1.iszero())
			System.out.println("Number is Zero");
		if(ob1.iseven())
			System.out.println("Number is even");
	  if(ob1.isodd())
			System.out.println("Number is Odd");
		
	}
}
