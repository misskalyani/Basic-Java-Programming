package Slip29;
//Q1) Write a program to create a class Customer(custno,custname,contactnumber,custaddr).
//Write a method to search the customer name with given contact number and display the details.
import java.util.Scanner;

import SLIP18.CricketPlayer;

class Customer 
{
    int custNo;
    String custName;
    String contactNumber;
    String custAddr;

    public Customer(int custNo, String custName, String contactNumber, String custAddr) 
    {
        this.custNo = custNo;
        this.custName = custName;
        this.contactNumber = contactNumber;
        this.custAddr = custAddr;
    }

    void disp() 
    {
        System.out.println("Customer No: " + custNo);
        System.out.println("Customer Name: " + custName);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Address: " + custAddr);
    }

  void search(Customer c[] ,int n,String name) 
   {
    int f=0;
       for(int i=0;i<5;i++) 
       {
           if(customers.custName.equals(name)) 
           {
               f=1;
           }
       }
       System.out.println("Customer not found.");
   }
}
public class Q1 
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limit = ");
        int n=sc.nextInt();
    	Customer c[] = new Customer[n];
    	for(int i=0;i<n;i++)
 		{

    			System.out.println("Enter Customer no = ");
    			int no=sc.nextInt();
    			System.out.println("Enter Name = ");
    			String nm=sc.next();
    			System.out.println("Enter contact Number = ");
    			int num =sc.nextInt();
    			System.out.println("Enter Address = ");
    			String add=sc.next();
    			c[i]=new Customer(no,nm,num,add);	
 		}
 	
 		for(int i=0;i<n;i++)
 		{
 			c[i].disp();
 		}
 		System.out.println("Enter Search Name = ");
		String snm=sc.next();
        search(Customer c[],int n,String snm);
    }


}

