class Demo
{
    void evenodd(int n)
     {
        if(n%2==0)
            System.out.print("\nNumber is Even");
       else
            System.out.print("\nNumber is Odd");
     }
         void leapyear(int y)
      {
              if(y%4==0)
            System.out.print("\nYear is Leap Year");
       else
            System.out.print("\nYear is Not Leap Year");
     }
        void square(int n)
        {
             int s=n*n;
             System.out.print("\nSquare="+s);
 }
    public static void main(String arg[])
  {
       Demo ob;                 //create object
       ob=new Demo();    //Allocate memory
       ob.evenodd(5);       //calling functions
       ob.leapyear(2024);
       ob.square(5);  
   }
}