package com.syntax.replit.hw062622;

public class MOverLoad159 {

    /*
    Create 3 overloaded methods to perform
    subtraction of 2, 3, and 4 numbers.
    In Main method execute all 3 methods to
    match the output:
    Expected Output:
    40 (should come from subtracting 4 numbers)
    30 (should come from subtracting 3 numbers)
    20 (should come from subtracting 2 numbers)
     */

    void sum(int a,int b, int c, int d) {
        int x = a - b - c - d;
        System.out.println(x + " (should come from subtracting 4 numbers)");
    }
    void sum(int a, int b, int c) {
        int y = a - b - c;
        System.out.println(y + " (should come from subtracting 3 numbers)");
    }
    void sum(int a, int b) {
        int z = a - b;
        System.out.println(z + " (should come from subtracting 2 numbers)");
    }

    public static void main(String[] args) {
        MOverLoad159 s = new MOverLoad159();
        s.sum(90, 15, 10, 25);
        s.sum(80,30, 20);
        s.sum(55, 35);
    }
}
