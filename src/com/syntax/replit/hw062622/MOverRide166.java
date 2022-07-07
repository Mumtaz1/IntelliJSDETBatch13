package com.syntax.replit.hw062622;

public class MOverRide166 {

    /*
    Create a class Animal in which define
    instance variable type, constructor
    that will initialize instance variables
    and 2 methods eat and sleep.
    Calculate a subclass Cat in which
    override method sleep.
    Create 3 Kitten subclasses of a Cat
    class and override method eat
    for 1 kitten - eats milk
    for 2 kitten - eats snack
    for 3 kitten - eats everything.
    In Main method create object of Cat
    class and all 3 kitten classes and
    store into an array of Animals. Call
    available methods.
    Expected Output:
    Cat eats
    Cat sleeps a lot
    kitten1 eats milk
    kitten1 sleeps a lot
    kitten2 eats snacks
    kitten2 sleeps a lot
    kitten3 eats everything
    kitten3 sleeps a lot
     */

//This is not working here. Works in repl

/*
    public static void main(String[] args) {
        MOverRide166 [] cat = {new MOverRide166("Cat"), new kitten1("kitten1"),
                new kitten2("kitten2"), new kitten3("kitten3") };

        for (MOverRide166 print : cat) {
            print.eat();
            print.sleep();
        }
    }
}
class Animal {
    String type;

    Animal(String type) { //this is a constructor
        this.type = type;
    }
    void eat() {
        System.out.println(type + " eats");
    }
    void sleep() {
        System.out.println(type + " sleeps a lot");
    }
}

class Cat extends Animal {
    Cat (String type) {
        super(type);
    }
    void sleep() {
        System.out.println(type + " sleeps a lot");
    }
}

class kitten1 extends Cat {
    kitten1(String type) {
        super(type);
    }
    void eat() {
        System.out.println(type + " eats milk");
    }
}
class kitten2 extends Cat {
    kitten2(String type) {
        super(type);
    }
    void eat() {
        System.out.println(type + " eats snacks");
    }
}
class kitten3 extends Cat {
    kitten3(String type) {
        super(type);
    }
    void eat() {
        System.out.println(type + " eats everything");
    }   */
}