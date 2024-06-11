import java.util.*;
class InvalidEmailId extends Exception
{
    public String toString()
    {
       return "Invalid EmailId Exception ";
    }
}
class EmailId
{
	String uname,pass;
	EmailId()
	{
	  uname="OM";
	  pass="AmMu13";
	}
	EmailId(String uname,String pass)
	{
	  this.uname=uname;
	  this.pass=pass;
	}
	void disp()
	{
	  System.out.print("\nUser Name = "+uname);
	  System.out.print("\nPassword = "+pass);
	}
}
class Email
{
  public static void main(String arg[])
  {
    try
    {
      char ch;
      String uname=arg[0];
      String pass=arg[1];
      for(int i=0;i<uname.length();i++)
      {
        ch=uname.charAt(i);
        if(!Character.isUpperCase(ch))
        {
            throw new InvalidEmailId();
        }
      }
      if(uname.length()<5)
      {
           throw new InvalidEmailId();
      }
       if(pass.length()<6)
      {
           throw new InvalidEmailId();
      }
      int u=0,l=0,d=0;
      for(int i=0;i<pass.length();i++)
      {
        ch=pass.charAt(i);
        if(Character.isUpperCase(ch))
        {
            u=1;
        }
        if(Character.isLowerCase(ch))
        {
            l=1;
        }
        if(Character.isDigit(ch))
        {
            d=1;
        }
      }
      if(u!=1&&l!=1&&d!=1)
      {
          throw new InvalidEmailId();
      }
      EmailId ob=new EmailId(uname,pass);
      ob.disp();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
