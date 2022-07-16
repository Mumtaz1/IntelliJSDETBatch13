package com.syntax.replit.hw071022;

import java.util.LinkedList;
import java.util.List;

public class LinkedList193 {

    /*
    Create a Linked List that will store Integer Objects.
    Add the values below:
    111
    222
    333
    444
    555
    666
    Create a logic to calculate sum of all the values
    in the list.
    Print the resul of sum.
    Expected Output:
    Result of sum is 2331
     */

    //Method to calculate sum recursively
    public static int sumOfArray(Integer [] a, int n) {
        if (n == 0) {
            return a[n];
        } else
            return a[n] + sumOfArray(a, n - 1);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(111);
        numbers.add(222);
        numbers.add(333);
        numbers.add(444);
        numbers.add(555);
        numbers.add(666);

        //Converting above list to array using toArray() method
        Integer a[] = new Integer[numbers.size()];
        numbers.toArray(a);

        //Recursion math to calculate sum and store sum in a variable
        int sum = sumOfArray(a, a.length - 1);
        System.out.println("Result of sum is " + sum);

    }
}