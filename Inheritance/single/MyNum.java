import java.util.*;
class MyNumber
{
	int n;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number = ");
		n=sc.nextInt();
	}
}
class operation extends MyNumber
{
	void isprime()
	{
		int i;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				break;
			}
		}
		if(i==n)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}
	void perfectsquare()
	{
	  if(n%2==1) 
	    System.out.println("Number is Perfect");
		else
			System.out.println("Number is not Perfect");
	}
	void factorial()
	{
	  int f=1;
	  for(int i=1;i<(n+1);i++)
	  {
	    f=(f*i);
	  }
	   System.out.println("Factorial = "+f);
	}
}
class Mdemo
{
  public static void main(String arg[])
  {
    operation ob =new operation();
    ob.accept();
    ob.isprime();
    ob.factorial();
    ob.perfectsquare();
    
  }
}
