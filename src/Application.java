/**
 * This class contains a main method to test the 
 * dictionary class and its methods.
 * @author chessicanation 
 * CS215
 * Assignment 5.1
 */

import java.io.*;

public class Application 
{

	public static void main(String[] args) throws IOException 
	{
		
		Dictionary myDictionary = new Dictionary();

		myDictionary.display();
		
		myDictionary.search("scot");
		myDictionary.search("ThiTher");
		myDictionary.search("GUERDON");
		myDictionary.search("Clew");
		myDictionary.search("selfie");

	}//end main

}//end class
