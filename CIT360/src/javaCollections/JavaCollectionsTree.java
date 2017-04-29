package javaCollections;

import java.util.TreeSet;
import java.util.Iterator;

public class JavaCollectionsTree 
{
public static void createTree()
{
	TreeSet<String> tree = new TreeSet<String>();
	
	//Add languages
	tree.add("English");
	tree.add("Japanese");
	tree.add("American Sign Language");
	tree.add("French");
	tree.add("Italian");
	
	//Check if empty
	System.out.println("Let's check if it's empty ");
	System.out.println("Our tree is empty = " + tree.isEmpty() + "\n");
	
	//Check size
	System.out.println("Let's check if it's empty ");
	System.out.println("Our tree is empty = " + tree.size() + "\n");
	
	//See if it contains
	System.out.println("Let's check if it contains French");
	System.out.println("Our tree contains French = " + tree.contains("French") + "\n");
	
	//Print them out
	Iterator<String> iterator = tree.iterator();
	System.out.println("Let's Print them: ");
	
	while (iterator.hasNext())
	{
		String element = iterator.next();
		System.out.println(element + " ");
	}
	System.out.println("\n");
	
	//Remove entry
		System.out.println("Let's remove Italian ");
		tree.remove("Italian");
		
		Iterator<String> iterator1 = tree.iterator();
		System.out.println("Let's Print the new list: ");
		while (iterator1.hasNext())
		{
			String element = iterator1.next();
			System.out.println(element + " ");
		}
	
}
}
