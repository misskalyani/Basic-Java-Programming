import java.util.*;
class std
{
	int no,n;
	String name;
	float marks;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
			System.out.print("Enter no = ");
			no=sc.nextInt();
			System.out.print("Enter name = ");
			name=sc.next();
			System.out.print("Enter marks = ");
			marks=sc.nextFloat();
	}
	void disp()
	{
			System.out.print("\nno = "+no);
			System.out.print("\nname = "+name);
			System.out.print("\nmarks = "+marks);

	}
	public static void main(String ary[])
	{
		int i;
		std ob[]=new std[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit = ");
		int n=s.nextInt();
		for(i=0;i<n;i++)
		{
			ob[i]=new emp();
			ob[i].accept();
		}
		for(i=0;i<n;i++)
		{
			ob[i].disp();
		}
	}
}
