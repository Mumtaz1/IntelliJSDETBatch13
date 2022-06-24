package com.syntax.class19;

public class Parent {
    //Inheritance using extends keyword.
    // A parent cannot access the child but a child can access the parent.

    String name = "Misha";
    double money = 100000;

}
class Child extends Parent {

    void printInfo() {
        System.out.println("My full name is Khrystyna " + name);
    }
    void buyCar() {
        System.out.println("Heheheh buying car from Papas money " + money);
    }
}
class tester {
    public static void main(String[] args) {
        Child child = new Child();
        child.printInfo();
        child.buyCar();
    }
}