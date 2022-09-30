/**
 * This class uses a hashmap to represent a dictionary that 
 * loads unsorted key/definition pairs from a file.
 * @author chessicanation 
 * CS215
 * Assignment 5.1
 */

import java.io.*;
import java.util.*;

public class Dictionary 
{

	private HashMap<String, String> dictionaryMap;
	
	/**
	 * Empty-argument constructor instantiates hashmap 
	 * and loads keys/definitions from a designated file.
	 * @throws IOException
	 */
	public Dictionary() throws IOException
	{
		dictionaryMap = new HashMap<String, String>();

		Scanner scan = new Scanner(new FileReader("/Users/chessicanation/eclipse-workspace/Assignment5.1_HashMap_CBN/DictionaryWordValuePairs.txt")); 
		
		while(scan.hasNextLine())
		{
			String[] parts = scan.nextLine().split("\t");
			dictionaryMap.put(parts[0], parts[1]);
		}//end while
		scan.close();
	}//end empty-argument constructor
	
	/**
	 * This method iterates through the dictionary and prints all 
	 * of the key/value pair entries.
	 */
	public void display()
	{
		System.out.println("\n======================== Complete Unsorted Dictionary ========================\n");
		for(String i : dictionaryMap.keySet())
		{
			System.out.println("Key: " + i + "\n\t Value: " + dictionaryMap.get(i));
		}//end for
		System.out.println("\n==============================================================================\n");
	}//end display

	/**
	 * This method allows the user to search the dictionary
	 * for a given word.
	 * @param word
	 */
	public void search(String word)
	{
		word = word.toLowerCase();
		String valueResult = dictionaryMap.get(word);
		if(valueResult != null)
		{
			System.out.println("\n****************************** Dictionary Search *****************************\n");
			System.out.println("Word: " + word + "\tDefinition: " + valueResult + "\tHashkey: " + word.hashCode());
			System.out.println("\n******************************************************************************\n");
		}//end if
		else
		{
			System.out.println("\n****************************** Dictionary Search *****************************\n");
			System.out.println(word + " cannot be found in the dictionary.");
			System.out.println("\n******************************************************************************\n");
		}//end else
	}//end search	
	
}//end class
