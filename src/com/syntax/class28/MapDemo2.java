package com.syntax.class28;

import java.util.HashMap;
import java.util.Set;

public class MapDemo2 {

    public static void main(String[] args) {
        //Map is an interface, just like Set.

        //To store key value pairs
        HashMap<String, Integer> groceries = new HashMap<>();
        groceries.put("Eggs", 12); // adds the key value pairs to the map - Eggs is the key, and 12 is the value
        groceries.put("Milk", 3);
        groceries.put("Apple", 3);
        groceries.put("Fish", 25);
        groceries.put("Fish", 50);

        Set<String> key = groceries.keySet();
        for (String s : key) {
            System.out.println(s); //Apple Fish Eggs Mile one per line
        }
    }
}
