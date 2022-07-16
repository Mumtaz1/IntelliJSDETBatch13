package com.syntax.replit.hw071022;

import java.util.LinkedList;
import java.util.List;

public class ListRemove194 {

    /*
    Create a method that will remove an element
    based on the specified condition from given
    List and return new List;
    Expected Output:
    [USA, Kazakhstan, Pakistan, Russia]
     */

    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        for (int i = 0; i < countries.size(); i++) {
            if (countries.remove("Armenia") || countries.remove("Australia") ||
                    countries.remove("Azerbaijan") );
        }
        System.out.println(countries);
    }
}