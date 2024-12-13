/*a) Write a java program to delete the files having extension. txt. (Use command line arguments)
*/
import java.io.*;
public class Q10 {
	public static void main(String[] args) 
	{
	    for (String fileName : args)
	    {
	    	File file = new File(fileName);
	    	if (file.delete() && file.getName().endsWith(".txt")) 
	    	{
	        System.out.println("Deleted: " + fileName);
	    	}
	    }

	}
}
