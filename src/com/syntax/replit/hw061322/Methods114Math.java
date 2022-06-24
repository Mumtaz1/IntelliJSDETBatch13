package com.syntax.replit.hw061322;

public class Methods114Math {

    /*
    Step1. Create three methods that will accept
           2 in parameters of integer type.
    Step2: Write the logic in methods to perform
           the below actions:
           - The 1st method for multiplication.
           - The 2nd method for addition.
           - The 3rd method for subtraction.
    Step 3: Execute all methods.
    1. for the addition method add two numbers to make 30.
    2. for multiplication multiply two numbers to make 30.
    3. for subtraction subtract two numbers to equal 20.
    Expected Output:
    Addition 30
    Multiplication 30
    Subtraction 20.
     */

    void printMultiply(int num1, int num2) {
        System.out.println("Multiplication " + (num1 * num2));
    }

    void printAdd(int num1, int num2) {
        System.out.println("Addition " + (num1 + num2));
    }

    void printSubtract(int num1, int num2) {
        System.out.println("Subtraction " + (num1 - num2));
    }

    public static void main(String[] args) {
        Methods114Math result = new Methods114Math();
        result.printAdd(10, 20);
        result.printMultiply(5, 6);
        result.printSubtract(50, 30);
    }
}
