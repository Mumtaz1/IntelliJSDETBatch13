package com.syntax.class18;

public class HW2Reverse {

    /*
    Create a method that will take a String as a
    parameter and returns reversed String. Method
    should be available to all classes within your
    project and accessible class name.
     */
    public String reverseString(String str) {
        StringBuilder newStr = new StringBuilder(str);
        newStr = newStr.reverse();
        return newStr.toString();
    }

    public static void main(String[] args) {
        HW2Reverse words = new HW2Reverse();
        System.out.println(words.reverseString("Happy Birthday"));
    }
}
