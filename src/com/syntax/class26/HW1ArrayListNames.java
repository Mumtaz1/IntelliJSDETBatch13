package com.syntax.class26;

import java.util.ArrayList;

public class HW1ArrayListNames {

    /*
    Create an ArrayList that will store 5 names into it.
    - Find out whether the given ArrayList is empty or not.
    - Check whether the specific name is present in an ArrayList or not?
    - Find the size of your ArrayList and print all values from that
     */
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jane");
        names.add("John"); //adds the element to an arrayList
        names.add("Adam");
        names.add("Eve");
        names.add("Mary");
        System.out.println("Is the arrayList names empty? " + names.isEmpty());
        System.out.println("Is John one of the elements in the arrayList? " + names.contains("John"));
        System.out.println("The size of the names arrayList is: "  + names.size());
        System.out.println("The arrayList names contains the following names: " + names);

    }
}
