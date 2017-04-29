package javaCollections;

import java.util.ArrayList;

public class JavaCollectionsList 
{
public static void createList()
{
	// create new array called array
	ArrayList<String> array = new ArrayList<String>();
	
	// Add objects to array
	array.add("Kumquat");
	array.add("Bumfuzzle");
	array.add("Collywobbles");
	array.add("Cattywampus");
	
	//Outputs length
	System.out.println("Our array is currently " + array.size() + " long\n"); 
	
	//Output those objects
	System.out.println("Here's what's in the list: " + array + "\n");
	
	
	//Replace value by position value
	System.out.println("Let's replace position 2 with Taraddiddle\n");
	array.add(2, "Taradiddle");
	System.out.println("Here's what's in the list: " + array + "\n");
	
	//Remove by value
	System.out.println("Let's remove Kumquat from the list\n");
	array.remove("Kumquat");
	System.out.println("Here's what's in the list: " + array + "\n");
	
	//Remove by position value
	System.out.println("Let's remove whatever is in the first position from the list\n");
	array.remove("0");
	System.out.println("Here's what's in the list: " + array);
}
}
