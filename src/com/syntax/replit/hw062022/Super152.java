package com.syntax.replit.hw062022;

public class Super152 {

    /*
    In Parent class.
    Create a constructor, it will take a
    String parameter called city.
    Include the logic of printing the
    parameter value.
    Create another constructor without
    parameter.
    Include the logic of printing
    "Parent Constructor".
    Create a Child Class that should be a
    sublcass of Parent class. Inside
    child class create a constructor that
    will make a call to parameterized
    constructor of the parent class.
    In Main class:
    Create an object of the child class
    by passing String value "Vienna".
    Expected Output:
    Vienna
     */
}
class Parent {
    String city;

    Parent() {
        System.out.println("Parent constructor");
    }
    Parent(String city) {
        this.city = city;
        System.out.println(this.city);
    }
}
class Child extends Parent {
    Child(String city) {
        super(city);
    }

    public static void main(String[] args) {
        Child person = new Child("Vienna");
    }
}
