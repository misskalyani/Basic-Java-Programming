import java.util.*;
class demo
{
	public static void main(String ar[])
	{
		Date d1=new Date();
		System.out.println("Date And time = "+d1);
		int dd=d1.getDate();
		int mm=d1.getMonth()+1;
		int yy=d1.getYear()+1900;
		System.out.println("Date = "+dd+"/"+mm+"/"+yy);
		int hr=d1.getHours();
		int min=d1.getMinutes();
		int sec=d1.getSeconds();
		System.out.println("Time = "+hr+":"+min+":"+sec);
		
	}
}
