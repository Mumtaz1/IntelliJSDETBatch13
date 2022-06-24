package com.syntax.class18;

public class HW3Vowels {

    /*
    Create a method that will accept a String as
    a parameter and return a new String that
    consists only of vowels. Method should be
    available inside the class only where it was
    declared and executed by calling its name.
     */
    private static String vowels(String str) {
        return str.replaceAll("[^aeiou]", "");
    }

    public static void main(String[] args) {
        String word = "Happy Birthday";
        System.out.println(vowels(word));
    }
}
