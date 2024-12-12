//Q1) Write a Program to print all Prime numbers in an array of ‘n’ elements.(use command line arguments)
class PrNo
{
  public static void main (String[] args)
  {
    int size = args.length,flag=1;
    int[] array = new int [size];
    for(int i=0; i<size; i++)
    {
      array[i] = Integer.parseInt(args[i]);
    }
    System.out.println("\n\nArray Elements Are\n");
    for(int i=0;i<size;i++)
    {
      System.out.print(array[i]+"\t");
    }
    System.out.println("\n\n\nPrime Numbers Are\n");
   for(int i=0; i<size; i++)
    {
        for (int j=2; j<array[i]; j++)
        {
          if(array[i]%j==0)
          {
            flag=0;
            break;
          }
        } 
      if(flag==0)
      System.out.print(array[i]+"\t");
      
   }
 }
}
/*OUTPUT::
┌──(kalyani㉿lenovo)-[~/Java]
└─$ java SLIP1Q1.java 1 2 3 4 5 6 7 8 9 10        
Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true


Array Elements Are

1	2	3	4	5	6	7	8	9	10	


Prime Numbers Are

4	5	6	7	8	9	10	            
*/
