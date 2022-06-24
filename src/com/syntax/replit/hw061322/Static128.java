package com.syntax.replit.hw061322;

public class Static128 {

    /*
    Create a static method with the following
    specification:
    Return Type: String
    Method Name: mixString
    Parameters:
    a String called s1
    a String called s2
    Then inside method write logic that will
    return the strings combined, one letter
    at a time, starting with s1. See example
    below for an example.
    NOTE: s1 and s2 should be of equal lengths;
    s1 ==> "12345"
    s2 ==> "abcde"
    mexString(s1, s2) ==> "1x2b3c4d5e"
     */

    //Function for alternatively merging two strings
    static String mixString(String s1, String s2) {
        //To store the final string
       StringBuilder result = new StringBuilder();

       //For every index in the strings
        for (int i = 0; i < s1.length() || i < s2.length(); i ++)  {

            //First choose the ith character of the
            //first string it it exists
            if (i < s1.length())
                result.append(s1.charAt(i));

            //Then choose the ith character of the
            // second string if it exists
            if (i < s2.length())
                result.append(s2.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String firstValue = mixString("12345", "abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy", "hello");
        System.out.println(secondValue);

    }
}