package com.syntax.class26;

import java.util.ArrayList;

public class HW4ArrayListDrinks {
    
    /*
    Create an arrayList of drinks. If any drink has letter "a" or "e" replace it with water.
     */

    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Pepsi");
        drinks.add("Tea");
        drinks.add("Budlight");
        drinks.add("Coffee");
        drinks.add("Cocoa");
        drinks.add("Rum");
        System.out.println(drinks);

        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.remove(i);
                drinks.add(i, "water");
            }
        }
        System.out.println(drinks);
    }
}