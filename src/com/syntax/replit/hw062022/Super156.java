package com.syntax.replit.hw062022;

public class Super156 {
    /*
    Create class A
    declare variable int i = 10;
    Create class B extends A
    declare variable int i = 20;
    Create a method to display value
    of variable i from both classes.

    In Main class create an object of
    subclasses and call method
    display.
    Expected Output:
    20
    10
     */

    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}

class A {
    int i = 10;

    void display() {
        System.out.println(i);
    }
}

class B extends A {
    int i = 20;

    void display() {
        System.out.println(i);
        super.display();
    }
}