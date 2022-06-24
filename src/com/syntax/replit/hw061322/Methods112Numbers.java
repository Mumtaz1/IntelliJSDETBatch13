package com.syntax.replit.hw061322;

public class Methods112Numbers {

    /*
    1. Create a method in which you will be printing
       numbers from 1 to 10.
    2. Call the method in the main method.
    Expected Output:
    1
    2
    3
    ... all the way down to 10.
     */
    void num() {
        for (int i = 1; i <= 10; i ++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Methods112Numbers numbers = new Methods112Numbers();
        numbers.num();
    }
}