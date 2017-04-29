package javaCollections;

import java.util.HashSet;

public class JavaCollectionsSet 
{
public static void createSet()
{
	// create new set called set
		HashSet<String> set = new HashSet<String>();
		
		// Add objects to set
		set.add("CIT360");
		set.add("CIT336");
		set.add("CIT325");
		set.add("CS165");
		
		//Check if empty
		System.out.println("First we'll check if it's empty");
		System.out.println("Our set is empty = " + set.isEmpty() + "\n");
		
		//Outputs length
		System.out.println("Our set is currently " + set.size() + " long\n"); 
		
		//Output those objects
		System.out.println("Here's what's in the list: " + set + "\n");
		
		//Copy the set
		System.out.println("Let's copy the set");
		HashSet<String> clone = new HashSet<String>();
		clone=(HashSet)set.clone();
		System.out.println("Here our cloned set: " + clone + "\n");
		
		//Remove by value
		System.out.println("Let's drop CIT360");
		set.remove("CIT360");
		System.out.println("Here's what's in the list: " + set + "\n");
		
		//Remove Everything!
		System.out.println("Heck, let's drop all our classes!");
		set.clear();
		System.out.println("Here's what's in the list: " + set + " Wahoo! Time to play Overwatch\n");
		
}
}
