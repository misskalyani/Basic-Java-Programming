import Operation.*;
import java.util.*;
public class main 
{

	public static void main(String[] args)
	{
		int n1,n2;
		float num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no=");
		n1=sc.nextInt();
		System.out.println("Enter second no=");
		n2=sc.nextInt();
		System.out.println("Enter third no=");
		num1=sc.nextFloat();
		System.out.println("Enter fourth no=");
		num2=sc.nextFloat();
		Addition ob1=new Addition();
		ob1.add(n1,n2);
		ob1.sub(num1,num2);
		ob1.max(n1,n2);

	}

}
