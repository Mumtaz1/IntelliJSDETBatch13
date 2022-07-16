package com.syntax.replit.hw071022;

import java.util.*;

public class Link190Fibonacci {

     /*
    Create Linked List that will store first
    10 number of fibonacci series.
    Print number from Linked List 1 by 1 all
    in 1 line.
    Expected Output:
    0 1 1 2 3 5 8 13 21 34
     */

    private LinkedList<Integer> fibonacciList;

    public Link190Fibonacci() {
        this.fibonacciList = new LinkedList<>();
    }
    public LinkedList<Integer> sum() {
        int n, a =0, b = 1, c= 1;
        for (int i = 0; i < 10; i++) {
            fibonacciList.add(a);
            a = b;
            b = c;
            c = a + b;
        }
        return fibonacciList;
    }
    public void display() {
        System.out.println(fibonacciList.toString().replace("[", "").
                replace("]", "").replaceAll(",", ""));
    }

    public static void main(String[] args) {
        Link190Fibonacci fibonacciList = new Link190Fibonacci();
        fibonacciList.sum();
        fibonacciList.display();

    }
}