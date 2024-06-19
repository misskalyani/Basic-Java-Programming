//count number of digits ,spaces,characters from a file
import java.io.*;

class demo
{
  public static void main(String ar[]) throws Exception
  {
    FileInputStream f1=new FileInputStream("pqr.txt");
    
    int k,d=0,ch=0,sp=0,sym=0;
    while(true)
    {
      k=f1.read();
      if(k==-1)
        break;
      if((k>='A'  && k<='Z')  ||( k>='a' && k<='z'))  
        ch++;
      if(k>=0 && k<=9)
        d++;
      if(k==' ')
        sp++;
      else
        sym++;
    }
    System.out.println("No Of Digits = "+d);
     System.out.println("No Of Character = "+ch);
      System.out.println("No Of Symblos = "+sym);
       System.out.println("No Of Spaces = "+sp);
  }
}
