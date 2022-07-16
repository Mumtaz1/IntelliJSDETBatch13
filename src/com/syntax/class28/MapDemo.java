package com.syntax.class28;

import java.util.HashMap;

public class MapDemo {

    public static void main(String[] args) {
        //Map is an interface, just like Set.

        //To store key value pairs
        HashMap<String, Integer> groceries = new HashMap<>();
        groceries.put("Eggs", 12); // adds the key value pairs to the map - Eggs is the key, and 12 is the value
        groceries.put("Milk", 3);
        groceries.put("Apple", 3);
        groceries.put("Fish", 25);
        groceries.put("Fish", 50);

        System.out.println(groceries.get("Milk"));  //3
        System.out.println("Fish"); //25

    }
}
