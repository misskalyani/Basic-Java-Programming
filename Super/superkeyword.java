class A
{
  int x=89;//base class member
}
class B extends A
{
   int x=44;//global
   void num()
   {
          int x=890;//local
          System.out.println("Value 1 = "+x);
          System.out.println("Value 2 = "+this.x);
          System.out.println("Value 3 = "+super.x);
   }
}
class MD
{
  public static void main(String arg[])
  {
    B ob = new B( );
    ob.num();
  }
}
