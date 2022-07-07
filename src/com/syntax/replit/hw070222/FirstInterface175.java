package com.syntax.replit.hw070222;

public interface FirstInterface175 {

    /*
    ** Follow steps carefully.
    Step1: Create Interface as FirstInterface and create
           undefined method as firstMethod (without parameter)
    Step2: Create another interface as SecondInterface in
           which you create a method as secondMethod
           (Without Parameter).
    Step3: Inherit both interfaces to Main class.
    Step4: Execute both methods.
    Expected Output:
    First Method implementing multiple Inheritance
    Second Method implementing multiple Inheritance
    */

 // Works here but not in Replit. Get non-static variable this cannot be referenced from a static context

    interface FirstInterface {
        void firstMethod();
    }
    interface SecondInterface {
        void secondMethod();
    }
    class Interface implements FirstInterface, SecondInterface {

        @Override
        public void firstMethod() {
            System.out.println("First Method implementing multiple Inheritance");
        }

        @Override
        public void secondMethod() {
            System.out.println("Second Method implementing multiple Inheritance");
        }
    }
    public class MultiInt {
        public static void main(String[] args) {
            Interface obj = new Interface();
            obj.firstMethod();
            obj.secondMethod();
        }
    }
}