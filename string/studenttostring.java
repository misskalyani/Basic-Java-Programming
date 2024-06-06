class student
{
	int rno;
	String name;
	static int cnt=0;
	student(int rno,String name)
	{
		cnt++;
		this.rno=rno;
		this.name=name;
	}
	public String toString()
	{
		return"\nObject Count = "+cnt+"\nRoll No = "+"\nName = "+name;
	}
	public static void main(String arg[])
	{
		student ob=new student(123,"Om");
	        System.out.println(ob);
	        student ob1=new student(78,"Sai");
	        System.out.println(ob1);
	        student ob2=new student(567,"sham");
	        System.out.println(ob2);
	}
}
