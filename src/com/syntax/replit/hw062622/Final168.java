package com.syntax.replit.hw062622;

public class Final168 {

    /*
    Create an instance final method that will
    reverse a String and return that new
    String.
    Call method from the main method.
    Expected Output:
    olleh
     */

    static final String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(Final168.reverseString("hello"));
    }
}