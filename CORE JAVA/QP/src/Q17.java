//b) Define a class Emp with a member Eid and display() method, inherit EmP class into the Emp Name class, Emp Name 
//class having a member Ename & display ( ) method.Write a Java program to accept details of employee [Eid, Ename] & display it. 
//(Use super keyword)
class Emp {
  int eid;

  public Emp(int eid) {
    this.eid = eid;
  }

  public void display() {
    System.out.println("Employee ID: " + eid);
  }
}

class EmpName extends Emp {
  String ename;

  public EmpName(int eid, String ename) {
    super(eid); // Calls Emp constructor
    this.ename = ename;
  }

  public void display() {
    super.display(); // Calls Emp display method
    System.out.println("Employee Name: " + ename);
  }

  
}

public class Q17 {

	public static void main(String[] args) {
	    EmpName emp = new EmpName(1, "John Doe");
	    emp.display();
	  }

}
