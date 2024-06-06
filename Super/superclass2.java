class A
{
  A(int x,int y)
  {
    int c=x+y;
    System.out.println("Addtion in A "+c);
  }
}
class B extends A
{
  B(int x,int y)
  {
    super(x,y);
    int c=x+y;
    System.out.println("Addtion in B "+c);
  }
}
class MD
{
  public static void main(String arg[])
  {
    B ob = new B(11,56);
  }
}
