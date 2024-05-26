import java.util.*;
class player
{
	String name;
	int no_of_innings,not_out_time,run,avg;
	void accept()
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter Name = ");
	    name=sc.next();
	    System.out.print("Enter number of innings = ");
	    no_of_innings=sc.nextInt();
	    System.out.print("Enter not out of time = ");
	    not_out_time=sc.nextInt();
	    System.out.print("Enter Total run = ");
	    run=sc.nextInt();
	}
	void calculate()
	{
		avg=run/not_out_time;
	}
	void disp()
	{
		System.out.println("Name = "+name);
		System.out.println("no.of innings = "+no_of_innings);
		System.out.println("not out time  = "+not_out_time);
		System.out.println("total run = "+run);
		System.out.println("Average = "+avg);
	}
	public static void main(String arg[])
	{
	    player ob=new player();
	    ob.accept();
	    ob.calculate();
	    ob.disp();
	}
	
}
