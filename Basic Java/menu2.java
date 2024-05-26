import java.util.*;
class menu
{
	int v,r,h,num;
	void volume(int r,int h)
	{
	    v=3.14f*r*r*h;
	    System.out.printf("Volume Of cylinder = %d ",v);
	}
	void factorial(int num)
	{
	
	}
	void armstrong(int num)
	{
	
	}
	public static void main(String arg[])
	{
	    menu ob=new menu();
	    do 
	    {
	        System.out.printf("\n1-Volume of cylinder \n2-Factorial \n3-Armstrong \n\nEnter Choice = %d ",ch);
	        case 1:Scanner sc=new Scanner(System.in);
	              System.out.printf("\nEnter Radius = %d",r);
	              r=sc.nextInt();
	              System.out.printf("\n Enter Height = %d",h);
	              ob.volume(r,h);
	              break;
	        case 2:     
	    }while(ch<5)
	}
}
