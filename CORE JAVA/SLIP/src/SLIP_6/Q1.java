package SLIP_6;
//Q1) Write a program to display the Employee(Empid, Empname, Empdesignation, Empsal) information using toString().
class emp
{
	int id;
	String nm,desi;
	int sal;
	emp()
	{
		id=67;
		nm="om";
		desi="math";
		sal=8900;
	}
	public String toString()
	{
		return "EMP InFo\n"+id+"\t"+nm+"\t"+desi+"\t"+sal;
	}
}
public class Q1 
{

	public static void main(String[] args) 
	{
		emp ob=new emp();
		System.out.println(ob);

	}

}
