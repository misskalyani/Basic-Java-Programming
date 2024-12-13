//a) Write a Java program to count number of vowels from given string.

public class Q7 {

	public static void main(String[] args) 
	{
	    String s1 = "Hello World";
	    int count = 0;
	    
	    for (int i=0;i<s1.length();i++) 
	    {
	    	if(s1.charAt(i)=='a' || s1.charAt(i)=='e' ||s1.charAt(i)=='i'||s1.charAt(i)=='o' ||s1.charAt(i)=='u')
			{
				count++;
			}
	    }
	    System.out.println("Vowel count: " + count);
	  }

}
