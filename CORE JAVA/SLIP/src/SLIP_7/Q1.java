package SLIP_7;
//Q1) Design a class for Bank. Bank Class should support following operations;
//a. Deposit a certain amount into an account
//b. Withdraw a certain amount from an account
//c. Return a Balance value specifying the amount with details
class Bank
{
	double balance;
	Bank()
	{
		balance = 0;
	}
	Bank(double initialBalance)
	{
		balance = initialBalance;
	}
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
	public double getBalance()
	{
		return balance;
	}

}
public class Q1 
{

	public static void main(String[] args)
	{
	Bank b = new Bank(1000);
	b.withdraw(250);
	System.out.println("the withdraw is:"+ b.balance);
	b.deposit(400);
	System.out.println("the deposit is:"+ b.balance);
	System.out.println("the balance is:"+ b.getBalance());
	}

}
/*OUTPUT:
Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
the withdraw is:750.0
the deposit is:1150.0
the balance is:1150.0
*/