package SLIP6;

import java.util.*;
//Q2) Create an abstract class “order” having members id, description. Create two subclasses
//“Purchase Order” and “Sales Order” having members customer name and Vendor name
//respectively. Define methods accept and display in all cases. Create 3 objects each of Purchase
//Order and Sales Order and accept and display details.
abstract class Order
{
	String desc;
	int id;
	Scanner sc=new Scanner(System.in);
	Order()
	{
		System.out.println("Enter ID ");
		id=sc.nextInt();
		System.out.println("Enter Description");
		desc=sc.next();
	}
}
class PurchaseOrder extends Order
{
	String cnm;
	Scanner sc=new Scanner(System.in);
	PurchaseOrder()
	{
		System.out.println("Enter Customer name");
		cnm=sc.next();
	}
	void disp()
	{
		System.out.println(id+"\t"+desc+"\t"+cnm);
	}
}
class SalesOrder extends Order
{
	String vnm;
	Scanner sc=new Scanner(System.in);
	SalesOrder()
	{
		System.out.println("Enter Vendor name");
		vnm=sc.next();
	}
	void disp()
	{
		System.out.println(id+"\t"+desc+"\t"+vnm);
	}
}
public class Q2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No Of Purchase Order");
		int n=sc.nextInt();
		PurchaseOrder ob[]=new PurchaseOrder[n];
		for(int i=0;i<n;i++)
		{
			ob[i]=new PurchaseOrder();
		}
		System.out.println("\nPurchase Order Detials");
		System.out.println("\nID\tDescri\tCname");
		for(int i=0;i<n;i++)
		{
			ob[i].disp();
		}
		System.out.println("Enter No Of Sales Order");
		int n1=sc.nextInt();
		SalesOrder ob1[]=new SalesOrder[n1];
		for(int i=0;i<n1;i++)
		{
			ob1[i]=new SalesOrder();
		}
		System.out.println("\nSales Order Detials");
		System.out.println("\nID\tDescri\tVname");
		for(int i=0;i<n1;i++)
		{
			ob1[i].disp();
		}
	}

}
/*OUTPUT:
Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
Enter No Of Purchase Order
3
Enter ID 
11
Enter Description
book
Enter Customer name
om
Enter ID 
22
Enter Description
pen
Enter Customer name
sai
Enter ID 
56
Enter Description
mouse
Enter Customer name
ram

Purchase Order Detials

ID	Descri	Cname
11	book	om
22	pen	sai
56	mouse	ram
Enter No Of Sales Order

7
Enter ID 
1
Enter Description
abc
Enter Vendor name
om
Enter ID 
2
Enter Description
def
Enter Vendor name
sai
Enter ID 
3
Enter Description
ghi
Enter Vendor name
sham
Enter ID 
4
Enter Description
jkl
Enter Vendor name
sita
Enter ID 
5
Enter Description
pqr
Enter Vendor name
gita
Enter ID 
6
Enter Description
lmn
Enter Vendor name
ammu
Enter ID 
7
Enter Description
xyz
Enter Vendor name
kallu

Sales Order Detials

ID	Descri	Vname
1	abc	om
2	def	sai
3	ghi	sham
4	jkl	sita
5	pqr	gita
6	lmn	ammu
7	xyz	kallu
*/
