import java.util.*;
abstract class Order
{
	int id;
	String discription;
	Scanner sc=new Scanner(System.in);
	abstract void accept();
	abstract void disp();
}
class purchase_order extends Order
{
	String cname;
	void accept()
	{
		System.out.print("Enter  Id ");
		id=sc.nextInt();
		System.out.print("Enter  Customer  Name ");
		cname=sc.next();
		System.out.print("Enter  Disciption ");
		discription=sc.next();
	}
	void disp()
	{
		
		System.out.println(id+"\t\t"+cname+"\t\t"+discription);
	}
}
class sales_order extends Order
{
	String vname;
	void accept()
	{
		System.out.print("Enter  Id ");
		id=sc.nextInt();
		System.out.print("Enter  Vendor Name ");
		vname=sc.next();
		System.out.print("Enter  Disciption ");
		discription=sc.next();
	}
	void disp()
	{
	
		System.out.println(id+"\t\t"+vname+"\t\t"+discription);
	}
}
class Mdemo
{
	public static void main(String ar[])
	{
		purchase_order ob1 =new purchase_order();
		purchase_order ob2 =new purchase_order();
		purchase_order ob3 =new purchase_order();
		ob1.accept();
		ob2.accept();
		ob3.accept();
		System.out.println("\nId\t\tName\t\tDisciption\t\t");
		ob1.disp();
		ob2.disp();
		ob3.disp();
		sales_order ob4 =new sales_order();
		sales_order ob5 =new sales_order();
		sales_order ob6 =new sales_order();
		ob4.accept();
		ob5.accept();
		ob6.accept();
		System.out.println("\nId\t\tName\t\tDisciption\t\t");
		ob4.disp();
		ob5.disp();
		ob6.disp();
	}
}
