package com.syntax.replit.hw061322;

public class InstantiateStringBuffer106Append {

    /*
    Instantiate and StringBuffer class
    Append Value "Hello" to it.
    Append value "World" to it.
    Print in UPPERCASE.
    Expected Output:
    HELLO WORLD
     */

    public static void main(String[] args) {

        String str = "Hello";
        System.out.print(str.toUpperCase());

        String str2 = " World";
        System.out.print(str2.toUpperCase());

        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("World");  // usage of append() method
    }
}