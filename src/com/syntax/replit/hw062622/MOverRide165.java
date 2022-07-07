package com.syntax.replit.hw062622;

public class MOverRide165 {

    /*
    Parent class create 4 methods with different
    levels of access modifiers. In each method
    print "I am parent public/protected/default/
    private method".
    Override methods in child class.
    In Main class create object of the child
    class and see which methods are available.
    Expected Output:
    I am a child public method
    Iam a child protected method
    I am a child default method
     */

    //This is not working correctly here. OK in Repl
    public void pubMeth() {
        System.out.println("I am a parent public method");
    }

    protected void proMeth() {
        System.out.println("I am a parent protected method");
    }

    void defMeth() {
        System.out.println("I am a parent default method");
    }

    private void privMeth() {
        System.out.println("I am a parent private method");
    }
}
class ChildA extends Parent { //its making me call this ChildA it says Dup if I call it Child
    public void pubMeth() {
        System.out.println("I am a child public method");
    }
    protected void proMeth() {
        System.out.println("I am a child protected method");
    }
    void defMeth() {
        System.out.println("I am a child default method");
    }

    public static void main(String[] args) {
        MOverRide165 obj = new MOverRide165();
        obj.pubMeth();
        obj.proMeth();
        obj.defMeth();
    }
}