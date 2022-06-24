package com.syntax.replit.hw061322;

public class Methods115UpperCase {

    /*
    Create a method that will accept a String as a
    parameter and return new String all in upper
    case.
    Call method
    Expected Output:
    TEST
     */
    String txt = "Test";
    void str() {
        System.out.println(txt.toUpperCase());
    }

    public static void main(String[] args) {
        Methods115UpperCase upper = new Methods115UpperCase();
        upper.str();
    }
}
