import java.util.*;
class emp
{
	int eno;
	int n;
	String ename;
	float sal;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
			System.out.print("Enter eno = ");
			eno=sc.nextInt();
			System.out.print("Enter ename = ");
			ename=sc.next();
			System.out.print("Enter salary = ");
			sal=sc.nextFloat();
	}
	void disp()
	{
			System.out.print( "\n"+eno);
			System.out.print( "\t"+ename);
			System.out.print( "\t"+sal);

	}
	static void sort(emp ob[],int n)
	{
	  int i,pass;
	  for(pass=1;pass<n;pass++)
	  {
	    for(i=0;i<n-pass;i++)
	    {
	      if(ob[i].ename.compareTo(ob[i+1]>0))
	      {
	        String t=ob[i];
	        ob[i]=ob[i+1];
	        ob[i+1]=t;
	      }
	    }
	  }
	  for(i=0;i<n;i++)
	  {
	      System.out.println(ob[i].eno+"\t"+ob[i].ename+"\t"+ob[i].sal);
	  }
	}
	public static void main(String ar[])
	{
	  int i;
		emp ob[]=new emp[10];
		Scanner s=new Scanner(System.in);
		System.out.print("\nenter no of emp = ");
		int n=s.nextInt();
		for(i=0;i<n;i++)
		{
		    ob[i]=new emp();
		    ob[i].accept();
		}
		System.out.println("\neno\tename\tsalary\n");
		for(i=0;i<n;i++)
		{
	  	ob[i].disp();
	  }	
	  System.out.println("\n\nSorted Order Salary Wise\n\n");
	  System.out.println("\neno\tename\tsalary\n");
	  sort(ob,n);
	}
	
}
