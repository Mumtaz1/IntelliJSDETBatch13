package com.syntax.class26;

import java.util.ArrayList;

public class HW3ArrayListRemove {

    /*
    Create an arrayList of words. Remove every word that ends with "e".
     */

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("People");
        words.add("Maybe");
        words.add("Happy");
        words.add("Java");
        words.add("Syntax");
        words.add("Apple");
        System.out.println(words);

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).endsWith("e")) {
                words.remove(i);
                i--;
            }
        }
        System.out.println(words);
    }
}