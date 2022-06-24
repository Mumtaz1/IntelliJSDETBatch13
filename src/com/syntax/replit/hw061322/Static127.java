package com.syntax.replit.hw061322;

public class Static127 {
    /*
    Create two methods:
    The first method should be a non-static
    method that will print out the
    following message:
    "Programming is amazing."
    The second method should be a static
    method that will print out the
    following message:
    "Java is awesome."
    Execute both methods.
    Expected Output:
    Programming amazing.
    Java is awesome.
     */

    //Non-static method:
    public String text1;

    //Static method:
    static String text2(String s) {
        return s;
    }

    public static void main(String[] args) {
        Static127 obj1 = new Static127();
        obj1.text1 = "Programming is amazing.";

        Static127 obj2 = new Static127();
        String s = "Java is awesome.";

        System.out.println(obj1.text1);
        System.out.println(s);
    }
}
