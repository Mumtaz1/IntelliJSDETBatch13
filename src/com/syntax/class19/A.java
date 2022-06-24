package com.syntax.class19;

public class A {

    /*
    Write program for multilevel inheritance where
    class C inherits from class B and Class B
    inherits from class A.
     */
    String firstName = "Jane";
    String lastName = "Doe";
}
class B extends A {
    String state = "California";

    void printInfo1() {
        System.out.println("The student's first name is " + firstName);
    }
    void printInfo2() {
        System.out.println("The student's last name is " + lastName);
    }
}
class C extends B {
    void printInfo3() {
        System.out.println("The state the student resides in is " + state);
    }
}
class member {
    public static void main(String[] args) {
        B b = new B();
        b.printInfo1();
        C c = new C();
        c.printInfo3();
    }
}
