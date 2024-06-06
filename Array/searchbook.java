import java.util.*;
class book
{
	int bno;
	String bname;
	int qty;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter book no = ");
		bno=sc.nextInt();
		System.out.println("enter book name = ");
		bname=sc.next();
		System.out.println("enter book qantity = ");
		qty=sc.nextInt();
	}
	void disp()
	{
	  System.out.println("\n"+bno);
	  System.out.print("\t"+bname);
	  System.out.print("\t"+qty); 
	}
	public static void main(String ary[])
	{
		int f=1,i;
		book ob[]=new book[10];
		Scanner s=new Scanner(System.in);
		System.out.println("enter limit");
		int n=s.nextInt();
		for(i=0;i<n;i++)
		{
			ob[i]=new book();
			ob[i].accept();
		}
		System.out.println("\n Book No\tBook name\tBook Quantity\t\n");
		for(i=0;i<n;i++)
		{
		    ob[i].disp();
		}
		System.out.println("enter search book name ");
		String name=s.next();
		for(i=0;i<n;i++)
		{
			if(ob[i].bname.equals(name))
			{
			System.out.println("Quantity = "+ob[i].qty);
			f=0;
			break;
			}
		}
		if(f==1)
		{
			System.out.println("Not Found");
		}
	}
}
