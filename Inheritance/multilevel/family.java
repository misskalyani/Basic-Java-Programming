import java.util.*;
class grandfather
{ 
  String gf,f,child;
  Scanner sc=new Scanner(System.in);
	void acceptgf()
	{
		System.out.println("Enter Grand Father Name =");
		String gf=sc.next();
	}	
}
class father extends continent
{ 
	void acceptf()
	{
		System.out.println("Enter Father Name =");
		String f=sc.next();
	}	
}
class child extends father
{ 
	void acceptc()
	{
		System.out.println("Enter Child Name =");
		child=sc.next();
	}
	void disp()
	{
		System.out.println("Grand Father ="+gf);
		System.out.println("Father ="+f);
		System.out.println("Child ="+child);
	}
}
class Mdemo
{
  public static void main(String arg[])
  {
	  child ob=new child();
	  ob.acceptgf();
	  ob.acceptf();
	  ob.acceptc();
	  ob.disp();
	}  
}
