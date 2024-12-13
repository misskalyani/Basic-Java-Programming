package SLIP3;

import java.util.*;
import java.io.*;
//Q2) Define a class patient (patient_name, patient_age, patient_oxy_level,patient_HRCT_report).
//Create an object of patient. Handle appropriate exception while patient oxygen level less than
//95% and HRCT scan report greater than 10, then throw user defined Exception “Patient is Covid
//Positive(+) and Need to Hospitalized” otherwise display its information.
class CovidException extends Exception
{
	public String toString()
	{
		return "Patients is Covid Positive(+) and Need to Hospitalized...";
	}
}
class patient
{
	String name;
	int age;
	double level,hrct;
	public patient(String name,int age,double level,double hrct)
	{
		this.name=name;
		this.age=age;
		this.level=level;
		this.hrct=hrct;
	}
}
public class Q2 
{

	public static void main(String[] args) 
	{
		String name;
		int age;
		double level,hrct;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		name=sc.next();
		System.out.println("Enter the age: ");
		age=sc.nextInt();
		System.out.println("Oxygen level: ");
		level=sc.nextDouble();
		System.out.println("HRCT report: ");
		hrct=sc.nextDouble();
		patient ob=new patient(name,age,level,hrct);
		try
		{
			if(ob.level<95 && ob.hrct>10)
				throw new CovidException();
			else
				System.out.println("Patient Info: \n"+"Name: "+ob.name+"\nAge: "+ob.age+"\nHRCTreport: "+ob.hrct+"\nOxygen level:"+ob.level);
		}
		catch(Exception e)
		{
			System.out.println("Error = "+e);
		}
		
	}

}
/*OUTPUT
Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
Enter name: 
Kalyani
Enter the age: 
20
Oxygen level: 
34
HRCT report: 
56
Error = Patients is Covid Positive(+) and Need to Hospitalized...
*/
