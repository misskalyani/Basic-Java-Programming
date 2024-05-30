class Emp
{
    int eno;
    String ename;
    double sal;
    void accept(int eno,String ename,double sal)
    {
       this.eno=eno;
       this.ename=ename;
       this.sal=sal;
    }
    void display()
    {
      System.out.println("Emp no="+eno);
      System.out.println("Emp name="+ename);
      System.out.println("Emp sal="+sal);
    }
   public static void main(String arg[])
   {
      Emp ob=new Emp();
     ob.accept(101,"om",50000);
       ob.display();
   }
}
