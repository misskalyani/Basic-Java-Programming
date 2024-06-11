import java.util.*;
class PatientsIsCovidPositivException extends Exception
{
	public String toString()
	{
		return "Patients is Covid Positive(+) and Need to Hospitalized...";
	}
}
class paitent 
{
	String pname;
	int age,oxygen_level,HRCT;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Paitent Name = ");
		pname=sc.next();
		System.out.print("Enter Paitent Age = ");
		age=sc.nextInt();
		System.out.print("Enter Paitent Oxygen Level = ");
		oxygen_level=sc.nextInt();
		System.out.print("Enter Paitent HRCT result = ");
		HRCT=sc.nextInt();
	}
	void disp()
	{
	   try
    {
      if(oxygen_level<95 && HRCT<10)
      {
          throw new PatientsIsCovidPositivException();
      }   
	        System.out.println("\n\nPaitent Detial \n\n");
	        System.out.println("Paitent Name = "+pname);
	        System.out.println("Paitent Age = "+age);
	        System.out.println("Paitent Oxygen Level = "+oxygen_level);
	        System.out.println("Paitent HRCT Result = "+HRCT);
	   }
	  catch(Exception e)
    {
        System.out.println(e); 
    }
	}
	 public static void main(String ar[])
  {
    paitent ob=new paitent();
    ob.accept();
    ob.disp();
   } 
}



