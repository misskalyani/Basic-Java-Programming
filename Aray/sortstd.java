import java.util.*;
class std
{
	int rno;
	String name;
	Float per;
	void accept()
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter roll no = ");
	  rno=sc.nextInt();
	  System.out.println("enter Name = ");
	  name=sc.next();  
	  System.out.println("enter per = ");
	  per=sc.nextFloat();
	}
	void disp()
	{
	    System.out.println(rno+"\t"+name+"\t"+per+"\t");
	}
	static void sort(std ob[],int n)
	{
	  int i,pass;
	  for(pass=1;pass<n;pass++)
	  {
	    for(i=0;i<n-pass;i++)
	    {
	      if(ob[i].per>ob[i+1].per)
	      {
	        std t=ob[i];
	        ob[i]=ob[i+1];
	        ob[i+1]=t;
	      }
	    }
	  }
	  for(i=0;i<n;i++)
	  {
	    System.out.println(ob[i].rno+"\t"+ob[i].name+"\t"+ob[i].per);
	  }
	}
	public static void main(String ary[])
	{
	  int i;
	  std ob[]=new std[20];
	  Scanner s =new Scanner(System.in);
	  System.out.println("Enter Limit = ");
	  int n=s.nextInt();
	  for(i=0;i<n;i++)
	  {
	    ob[i]=new std();
	    ob[i].accept();
	  }
	  System.out.println("\nrno\tname\tper\n");
	  for(i=0;i<n;i++)
	  {
	    ob[i].disp();
	  }
	System.out.println("\nPercentage wise Sorted Order \n");
	 System.out.println("\nrno\tname\tper\n");
	  sort(ob,n);
	}
}
