import java.io.*;
class md
{
  public static void main(String ar[]) throws Exception
  {
	  File f1=new File("abc.txt");
	  if(f1.exists())
	  {
		  System.out.print("File Found");
	  }
    if(f1.isFile())
	  {
		  System.out.print("Is a File");
	  }
	   if(f1.isDirectory())
	  {
		  System.out.print("It is Folder");
	  }
	   if(f1.canRead())
	  {
		  System.out.print("File is readable");
	  }
	   if(f1.canWrite())
	  {
		  System.out.print("file is writeable");
	  }
	  //System.out.println(f1.getName());
  }
}  
