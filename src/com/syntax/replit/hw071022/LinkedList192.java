package com.syntax.replit.hw071022;

import java.util.*;

public class LinkedList192 {

    /*
    Create a Linked List that will store all
    prime numbers from 1 to 100.
    Step 1. Create a method that will identify
            whether number is prime or not.
    Step 2: Add all prime numbers into
            Linked List.
     Print Linked List:
     Expected Output:
     [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
     41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
     89, 97]
     */

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList <>();
        for (int i = 0; i < 100; i++){
            if (isPrime(i)) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
    static boolean isPrime (int num) {
        boolean isPrime = true;
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}