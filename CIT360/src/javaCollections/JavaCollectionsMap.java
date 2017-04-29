package javaCollections;

import java.util.HashMap;
import java.util.Map;

public class JavaCollectionsMap 
{

public static void createMap() 
{

   //Creates a new map object called map
   Map<String, Integer> map = new HashMap<String, Integer>();

   //sets the amount of each item in food storage -  map.put(key, value)
   map.put("Canned Wheat", 50);
   map.put("Canned Beans", 15);
   map.put("Bags of Sugar", 5);

   //map.size() finds how many items are in map
   System.out.println("There are " + map.size() + " items in total.");

   //sets key variable
   String key = "Canned Wheat";

   //gets number of items
   System.out.println("There are " + map.get(key) + " " + key + " items.");
   System.out.println("\n");
   
   //checks whether it contains a key named the previously defined key
   if (map.containsKey(key))
   {
       System.out.println(key + " is a key in this map.");
   } else
   {
       System.out.println(key + " is not a key in this map.");
   }
   
   
   //checks whether there is a 15 in the map. Returns a boolean
   if (map.containsValue(15))
   {
       System.out.println("15 is a value in this map.");
   } else
   {
       System.out.println("15 is not a value in this map.");
   }

   //checks whether the map is empty
   if (map.isEmpty()){
       System.out.println("This map is empty.");
   } else{
       System.out.println("This map is not empty.");
   }

   //removes 
   map.remove("Canned Wheat");

   //checks again how many there are in the map
   System.out.println("There are " + map.size() + " items in total.");

   //clears all values in map
   map.clear();

   //check again how many there are in the map
   System.out.println("There are " + map.size() + " items in total.");

}

}
