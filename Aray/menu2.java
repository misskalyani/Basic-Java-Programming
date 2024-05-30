import java.util.*;
class menu
{
	int r,h,num;
	void volume(int r,int h)
	{
	    int v=(22/7)*r*r*h;
	    System.out.printf("Volume Of cylinder = %d ",v);
	}
	void factorial(int num)
	{
	  int f=1;
	  for(int i=1;i<(num+1);i++)
	  {
	    f=(f*i);
	  }
	}
	void armstrong(int num)
	{
	    int n,r,sum=0,temp;
	    temp=num;
	    while(num>0)
	    {
	      r=num%10;
	      sum=sum+(r*r*r);
	      num=num/10;
	    }
	    if(temp==num)
	    {
	      System.out.println("Armstrong number");
	    }
	    else
	     {
	      System.out.println(" Not Armstrong number");
	    }
	}
	public static void main(String arg[])
	{
	    int ch;
	    menu ob=new menu();
	    do 
	    {
	        System.out.println("1-Volume of cylinder ");
	          System.out.println("2-Factoril ");
	            System.out.println("3-Armstrong ");
	            Scanner s=new Scanner(System.in);
	         System.out.print("\nEnter Choice = ");
	        ch =s.nextInt();
	        switch(ch)
	        {
	          case 1:Scanner sc=new Scanner(System.in);
	                System.out.print("\nEnter Radius = ");
	                int r=sc.nextInt();
	                System.out.print("\n Enter Height = ");
	                int h=sc.nextInt();
	                ob.volume(r,h);
	                break;
	          case 2: Scanner sc1=new Scanner(System.in);
	                System.out.print("\nEnter Number = ");
	                int num=sc1.nextInt();
	                ob.factorial(num);
	                break;
	          case 3: Scanner sc2=new Scanner(System.in);
	                System.out.print("\nEnter Number = ");
	                int n=sc2.nextInt();
	                ob.armstrong(n);
	                break; 
	        } 
	    }while(ch<5);
	}
}
