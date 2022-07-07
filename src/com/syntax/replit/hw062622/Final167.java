package com.syntax.replit.hw062622;

public class Final167 {

    /*
    Create a constant variable to hold
    value "https://syntaxtechs.com"
    Print value of constant variable
    in the main method.
    Expected Output:
    [https://syntaxtechs.com]
    (https://syntaxtechs.com/)
     */

    static final String url = "https://syntaxtechs.com";

    public static void main(String[] args) {
        Final167 str = new Final167();

        char charToAdd1 = '[';
        char charToAdd2 = ']';
        char charToAdd3 = '(';
        char charToAdd4 = '/';
        char charToAdd5 = ')';

        System.out.print(charToAdd1 + url + charToAdd2);
        System.out.println(charToAdd3 + url + charToAdd4 + charToAdd5);
    }
}
