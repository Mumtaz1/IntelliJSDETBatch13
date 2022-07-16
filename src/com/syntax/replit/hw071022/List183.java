package com.syntax.replit.hw071022;

import java.util.ArrayList;
import java.util.List;

public class List183 {

    /*
    ArrayLists
    Create an array list that will hold String Objects.
    Find out whether array list is empty or not.
    Add String value "Syntax" to it.
    Find out whether array list is empty or not.
    Expected Output:
    true
    false
     */

    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        System.out.println(str.isEmpty());
        str.add("Syntax");
        System.out.println(str.isEmpty());

    }
}
