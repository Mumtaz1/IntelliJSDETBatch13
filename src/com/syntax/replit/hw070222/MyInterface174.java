package com.syntax.replit.hw070222;

public interface MyInterface174 {

    /*
    Create an Interface with name as MyInterface
    Create two undefined methods method1 and method2
    Inherit the MyInterface to Main class.
    Execute both methods
    Expected Output:
    implementation of method1
    implementation of method2
     */

    interface MyInterface {
        void method1();
        void method2();
    }
    class Test implements MyInterface {
        @Override
        public void method1() {
            System.out.println("implementation of method1");
        }
        @Override
        public void method2() {
            System.out.println("implementation of method2");
        }
    }
    class Int {
        public static void main(String[] args) {
            Test obj1 = new Test();
            obj1.method1();
            obj1.method2();
        }
    }
}
