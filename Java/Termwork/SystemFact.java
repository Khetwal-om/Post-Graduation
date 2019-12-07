// Java program to demonstrate redirection in System.out.println() 
import java.io.*; 

public class SystemFact 
{ 
	public static void main(String arr[]) throws FileNotFoundException 
	{ 
		// Creating a File object that represents the disk file. 
		PrintStream o = new PrintStream(new File("A.txt")); 

		// Store current System.out before assigning a new value 
		PrintStream console = System.out; 

		// Assign o to output stream 
		System.setOut(o); 
		System.out.println("This will be written to the text file"); 

	} 
} 


