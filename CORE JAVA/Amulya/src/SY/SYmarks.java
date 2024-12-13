package SY;

public class SYmarks
{
	int ct,mt,et;
	public SYmarks(int ct,int mt,int et)
	{
		this.ct=ct;
		this.mt=mt;
		this.et=et;
	}
	public void disp()
	{
		System.out.println("\nSy Marks");
		System.out.println("Computer\tMaths\tElectronics");
		System.out.println(ct+"\t"+mt+"\t"+et);
	}	
}
