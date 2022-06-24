package com.syntax.replit.hw061322;

public class Methods110newLine2 {

    /*
    1. Create a method name as newLine that should have
       print statement inside the method body as
       "newLine method implementation".
    2. Create a method name as displayLine that should
       have print statement inside the method body as
       "displayLine method implementation".
    Expected Output:
    newLine method implementation
    displayLine method implementation
     */
    void newLine() {
        System.out.println("newLine method implementation");
    }
    void displayLine() {
        System.out.println("displayLine method implementation");
    }

    public static void main(String[] args) {
        Methods110newLine2 print = new Methods110newLine2();
        print.newLine();
        print.displayLine();
    }
}