class A
{
  void Add(int x,int y)
  {
    int c=x+y;
    System.out.println("Addtion in A = "+c);
  }
}
class B extends A
{
  void Add(int x,int y)
  {
    super.Add(x,y);
    int c=x+y;
    System.out.println("Addtion in B ="+c);
  }
}
class MD
{
  public static void main(String arg[])
  {
    B ob = new B();
    ob.Add(56,89);
  }
}
