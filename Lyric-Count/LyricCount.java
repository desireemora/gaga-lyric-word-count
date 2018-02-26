//******************************************************************
// LyricCount.java                                                 *
// This program asks the user for a word and checks to see         *
// the number of times it appears in any text file it is linked to.*
// This one just so happens to be applause by Lady Gaga.           *
//******************************************************************

import java.util.Scanner; // Needed for the Scanner class
import java.io.*;         // Needed for the File class

public class LyricCount
{
	public static void main(String[] args) throws IOException
	{
	  int wcount = 0; // keeps track of word
	  String word, entry;
	  
	  System.out.println("This code lets a user enter a word" 
			+ " and checks a linked text file to see how many times "
			+ "it appears.");
	  
	  // Open the file.
	  
	  File inputfile = new File("gaga.txt"); //change the name of this file to your file
	  Scanner scan = new Scanner(inputfile);

	  // Read from the keyboard too!
	  
	  Scanner scanKey = new Scanner(System.in);
	  // Ask the user for a word and store it in entry
	  
	  System.out.println("What word would you like to count?");
	  entry = scanKey.nextLine();

	  // Read lines from the file until no more are left.
	  while (scan.hasNext())
	  {
			// Use the word variable to read the file
			
			word = scan.next();
			
			// if word is equal to entry
			
			if (entry.equalsIgnoreCase(word))
			wcount++;                   
	  }

	  // Close the file.
	  
	  scan.close();

	  // Print the number of times the word appears 
	  
	  System.out.println("The amount of times " +entry+ " is entered is: "+wcount);
	  
	  
			
	}
}

