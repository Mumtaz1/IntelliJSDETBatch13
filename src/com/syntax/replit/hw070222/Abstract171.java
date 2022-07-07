package com.syntax.replit.hw070222;

abstract class Abstract171 {

    /*
    Abstraction
    Create a Parent class that will have two
    overloaded abstract methods m1.
    Make Main class as concrete subclass to
    Parent class.
    In Main method call the methods.
    Expected Output:
    m1 without parameters
    m1 method with parameter.
     */

    void m1() {
        System.out.println("m1 without parameters");
    }
    void m1(int num) {
        System.out.println("m1 method with parameter");
    }
 }
 class Print extends Abstract171 {
     public static void main(String[] args) {
         Print parent = new Print();
         parent.m1();
         parent.m1();
     }
 }