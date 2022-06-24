package com.syntax.replit.hw062022;

public class AccessMod140StringMaxLength {

    /*
    Create the maxLength method that will
    accept String array of words and return
    the word with the largest length.
    Method should be visible only within
    the same package!
    Expected Output:
    this is long
     */
    protected static String maxLength(String[] array) {
        int maxLength = 0;
        String largestLength = null;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                largestLength = s;
            }
        }
        return largestLength;
    }

    public static void main(String[] args) {
        String[] arr = {"hey", "yolo", "hi", "this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }
}
