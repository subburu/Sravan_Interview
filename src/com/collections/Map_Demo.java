package com.collections;

import java.util.*;

public class Map_Demo {
    public static void main(String[] args)
    {
        // Creating an empty Map
        Map<String, Integer> map = new HashMap<String, Integer>();
 
        // Mapping int values to string keys
        map.put("Geeks", 10);
        map.put("You", 15);
        map.put("Geeks", 20);
        map.put("Welcomes", 25);
        map.put("4", 30);
        map.put("You", 100);
 
        // Displaying the Map
        System.out.println("Initial Mappings are: " + map);
        System.out.println("The Value is: " + map.get("4"));
        // Getting the value of "Geeks"
        System.out.println("The Value is: " + map.get("Geeks"));
 
        // Getting the value of "You"
        System.out.println("The Value is: " + map.get("You"));
    }
}