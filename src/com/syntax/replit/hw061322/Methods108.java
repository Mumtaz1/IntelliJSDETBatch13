package com.syntax.replit.hw061322;

public class Methods108 {

    /*
    1. Create a method and name as m1. Inside your method body
       add print statement as "m1 method implementation".
    2. Create another method and name as m2. Inside your
       method body add print statement as "m2 method
       implementation".
    3. Call these two methods in the main method.
    Expected Output:
    m1 method implementation
    m2 method implementation
     */


    void m1() {
        System.out.println("m1 method implementation");
    }
    void m2() {
        System.out.println("m2 method implementation");
    }
    public static void main(String[] args) {

        Methods108 str1 = new Methods108();
        Methods108 str2 = new Methods108();

        str1.m1();
        str2.m2();

    }
}
