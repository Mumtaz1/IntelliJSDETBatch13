package com.syntax.class19;

public class A2 {

    /*
    Write a program to inherit class A that has
    method printF which is static and call or
    reuse that method into class B.
     */
    public static void printF() {
        System.out.println("Hello");
    }
}

class B2 extends A2 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.printF();
    }
}