package TY;

public class TYmarks 
{
	int Theory,Practicals;
	public TYmarks(int Theory,int Practicals)
	{
		this.Theory=Theory;
		this.Practicals=Practicals;
	}
	public void disp()
	{
		System.out.println("\nTy Marks ");
		System.out.println("Theory\tPracticals");
		System.out.println(Theory+"\t"+Practicals);
	}
}

