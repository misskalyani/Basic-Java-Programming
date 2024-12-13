package SLIP_12;
//Q1) Write a program to create parent class College(cno, cname, caddr) and derived class
//Department(dno, dname) from College. Write a necessary methods to display College details.
import java.util.*;
class College
{
	String cname,caddr;
	int cno;
	
}
class dept extends College
{
	int dno;
	String dname;
	Scanner sc=new Scanner(System.in);
	void accept()
	{
			System.out.println("Enter College no");
			cno=sc.nextInt();
			System.out.println("enter College name");
			cname=sc.next();
			System.out.println("enter college address");
			caddr=sc.next();
			System.out.println("enter depatrment no");
			dno=sc.nextInt();
			System.out.println("enter department name");
			dname=sc.next();
	
	}
	void disp()
	{
		System.out.println(cno+"\t"+cname+"\t\t"+caddr+"\t"+dno+"\t"+dname);
	}
}
public class Q1 
{

	public static void main(String[] args)
	{
		dept ob=new dept();
		ob.accept();
		System.out.println("CNO\tCNAME\t\tCADDR\t\tDNO\tDNAME");
		ob.disp();
	}

}
/*OUTPUT:
Enter College no
121
enter College name
RBNB
enter college address
Shrirampur
enter depatrment no
13
enter department name
Computer
CNO	CNAME		CADDR		DNO	DNAME
121	RBNB		Shrirampur	13	Computer
*/