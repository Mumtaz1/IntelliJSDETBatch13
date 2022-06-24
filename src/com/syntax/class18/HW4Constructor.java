package com.syntax.class18;

public class HW4Constructor {

    /*
    Write a Java class that will have a
    constructor: one with parameters and
    second without any parameters. Create
    a separate Test class where you will
    execute both of the constructors 1 by 1.
     */
    HW4Constructor() {
        System.out.println("This constructor has no parameters");
    }
    HW4Constructor(String Hello) {
        System.out.println("This constructor contains a string "+ Hello);
    }
}
