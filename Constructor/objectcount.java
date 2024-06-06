import java.util.*;
class emp
{
	int id;
	String ename,dept;
	float sal;
	static int cnt=0;
	emp()
	{
		id=8765670;
		ename="om";
		dept="computer";
		sal=500000;
		cnt++;
	}
	 emp(int id,String ename,String dept,float sal)
	 {
	 	this.id=id;
		this.ename=ename;
		this.dept=dept;
		this.sal=sal;
		cnt++;		
	 }
	 //emp()
	 //{
	 	/*Scanner sc=new Scanner(System.in);
		System.out.println("Ebter id = ");
		id=sc.nextInt();
		System.out.println("Ebter ename = ");
		ename=sc.next();
		System.out.println("Ebter dept = ");
		dept=sc.next();
		System.out.println("Ebter sal = ");
		sal=sc.nextFloat();
		cnt++;
	 }*/
	 void disp()
	 {
	 	System.out.println("\n\n\nCount Object After creation = "+cnt);
	 	System.out.println("\n\n\nid\t\tename\t\tdept\t\tsal\t\t");
	 	System.out.println(id+"\t\t"+ename+"\t\t"+dept+"\t\t"+sal+"\t");
	 }
	public static void main(String arg[])
	{
		emp ob=new emp();
		ob.disp();
		//emp ob1=new emp();
		//ob1.disp();
		emp ob2=new emp(101345,"sai","science",540000);
		ob2.disp();
	}
}

		
