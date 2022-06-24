package com.syntax.replit.hw061322;

public class Varibl123Instance {

    /*
    Declare the instance variables to hold:
    - integer values
    - String values
    - double values
    - boolean values
    - float values
    Access instance variables and then print them
    all without assigning any values to them.
    Print variables one by one the same sequence
    that you declare them.
    Expected Output:
    0
    null
    0.0
    false
    0.0
     */
    int num;
    String x;
    double dd;
    boolean t;
    float f;

    public static void main(String[] args) {
        Varibl123Instance instVar1 = new Varibl123Instance();
        System.out.println(instVar1.num);
        System.out.println((instVar1.x));
        System.out.println(instVar1.dd);
        System.out.println(instVar1.t);
        System.out.println(instVar1.f);
    }
}