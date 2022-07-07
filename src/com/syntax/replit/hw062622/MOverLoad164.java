package com.syntax.replit.hw062622;

public class MOverLoad164 {

    /*
    Create a method hello() in parent class
    that will print "Method in Parent class"
    then override that method in 3
    Subclasses implementing login to print
    "method in Child1/Child2/Child3 class".

    In Main class create 3 objects of the
    child classes and store into an array
    and call method hello():
    Expected Output:
    method in Child1 class
    method in Child2 class
    method in Child3 class
     */
    public static void main(String[] args) {
        MOverLoad164[] obj = {new Child1(), new Child2(), new Child3()};

        for (MOverLoad164 child : obj) {
            child.hello();

        }
    }
    public void hello() {

        System.out.println("method in Parent class");
    }
}
class Child1 extends MOverLoad164 {
    public void hello() {
        System.out.println("method in Child1 class");
    }
}
class Child2 extends MOverLoad164 {
    public void hello() {

        System.out.println("method in Child2 class");
    }
}
class Child3 extends MOverLoad164 {
    public void hello() {

        System.out.println("method in Child3 class");
    }
}