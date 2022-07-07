package com.syntax.replit.hw062622;

public class MOverLoad163 {

    /*
    In Parent class create a method with name
    method() that will print "Parent method".
    Override method() in Child class that
    will print "Child method".
    In Main class create objects of child
    and parent class and call its method.
    Expected Output:
    Parent method
    Child method
     */
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.method();

        Child child = new Child();
        child.method();
    }
}
class Parent {
    public void method() {
        System.out.println("Parent method");
    }
}
class Child extends Parent {
    public void method() {
        System.out.println("Child method");
    }
}

