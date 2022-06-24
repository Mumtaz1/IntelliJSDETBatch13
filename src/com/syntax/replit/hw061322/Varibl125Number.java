package com.syntax.replit.hw061322;

public class Varibl125Number {

    /*
    Declare a static variable number that will
    hold an integer value:
    Access number from the main method and
    assign value to it. Create an Object of
    the class, access number in a nonstatic
    way and assign value of 200. Print out
    number using class name and using instance.
    Expected Output:
    200
    200
     */
    public static int number = 200;

    public void nonStatic() {
        System.out.println(number);
    }

    public static void main(String[] args) {
        System.out.println(200);
        System.out.println(Varibl125Number.number);
    }
}