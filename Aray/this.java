
class Demo
{
   int a=10;      //global  
  void show()
  {
       int a=55;       //local  
      System.out.println("Value="+this.a);
      System.out.println("Value="+a);  
     this.a=99;
       System.out.println("Value="+this.a);
      System.out.println("Value="+a);  
  }
  public static void main(String arg[])
  {
       Demo ob=new Demo();
       ob.show();   
  } 
}
