import java.util.*;
class product
{
	int pid;
	String pname;
	float p,q;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.printf("\nEnter pid = ");
		pid=sc.nextInt();
		System.out.printf("\nEnter pname = ");
		pname=sc.next();
		System.out.printf("\nEnter Price = ");
		p=sc.nextFloat();
		System.out.printf("\nEnter quantity = ");
		q=sc.nextFloat();
	}
	void disp()
	{
		System.out.print("\npid= "+pid);
		System.out.print("\npname = "+pname);
		System.out.print("\nPrice = "+p);
		System.out.print("\nquantity = "+q);
		
	}
	public static void main(String arg[])
	{
		product p=new product();
		p.accept();
		p.disp();
		
	}
}
