package SLIP_9;
import java.util.*;
//Q2) Write a program to using marker interface create a class Product (product_id, product_name,
//product_cost, product_quantity) default and parameterized constructor. Create objects of class
//product and display the contents of each object and Also display the object count.
interface demo
{
	
}
class Product
{
	int pid,pcost,pqty;
	String pnm;
	static int count=0;
	Product()
	{
		pid=78;
		pnm="kalyani";
		pcost=20000;
		pqty=1;
		count++;
	}
	Product(int id,String nm,int cost,int qty)
	{
		pid=id;
		pnm=nm;
		pcost=cost;
		pqty=qty;
		count++;
	}
	void disp()
	{
		System.out.println(pid+"\t"+pnm+"\t"+pcost+"\t"+pqty);
	}
}
public class Q2 
{
	public static void main(String[] args) 
	{
		Product p=new Product();
		Product p1=new Product(12,"ammuu",25000,2);
		System.out.println("\nID\tName\tCost\tQuantity");
		p.disp();
		p1.disp();
		System.out.println("Count = "+p.count);
	}

}
/*OUTPUT:
ID	Name	Cost	Quantity
78	kalyani	20000	1
12	ammuu	25000	2
Count = 2
*/