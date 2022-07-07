package com.syntax.replit.hw062622;

public class MOverLoad161 {

    /*
    Overload private instance method m1.
    Call each method from the main method.
    Expected Output:
    static method without parameter
    static method with int parameter
     */

    private static void m1() {
        System.out.println("static method without parameter");
    }
    private static void m1(int x) {
        System.out.println("static method with int parameter");
    }

    public static void main(String[] args) {
        MOverLoad161.m1();
        MOverLoad161.m1(5);
    }
}