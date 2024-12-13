package slip_1;
import java.util.*;
//Q2) Define an abstract class Staff with protected members id and name. 
//Define a parameterized constructor. Define one subclass OfficeStaff with member department. 
//Create n objects of OfficeStaff and display all details
abstract class Staff
{
	protected int id;
	protected String nm;
	Staff(int i,String n)
	{
		id=i;
		nm=n;
	}
	
}
class Officestaff extends Staff
{
	String dept;
	Officestaff(int i,String n,String de)
	{
		super(i,n);
		dept=de;
	}
	void disp()
	{
		System.out.println(id+"\t\t"+nm+"\t\t"+dept);
	}
}

public class Q2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit ");
		int n=sc.nextInt();
		Officestaff ob[]=new Officestaff[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("\nEnter Id , Name , Department \n");
			int id=sc.nextInt();
			String nm=sc.next();
			String dept=sc.next();
			ob[i]=new Officestaff(id,nm,dept);
		}
		System.out.println("\n\nId\t\tName\t\tDepartment\t\t");
		for(int i=0;i<n;i++)
		{
			ob[i].disp();
		}
	}

}
/*OUTPUT
Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
Enter Limit 
4

Enter Id , Name , Department 

1234
Om
Chem

Enter Id , Name , Department 

5678
Sai
Chem

Enter Id , Name , Department 

9876
Ram
Bio

Enter Id , Name , Department 

5432
Sham
Com


Id		Name		Department		
1234		Om		Chem
5678		Sai		Chem
9876		Ram		Bio
5432		Sham		Com
*/