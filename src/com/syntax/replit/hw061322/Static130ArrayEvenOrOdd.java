package com.syntax.replit.hw061322;

public class Static130ArrayEvenOrOdd {

    /*
    Complete the mystery method so that it takes
    in an integer array as a parameter, and then
    modifies each element based on whether it's
    even or odd.
    If the number is even, divide it by 2. If it
    is odd, multiply it by 10.
    Expected Output:
    10 1 30 2 50
     */

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        mystery(a);
        // should print out 10 1 30 2 50
    }
    static void mystery(int[] array)    {
        for(int elem:array){
            if(elem%2==0){
                elem/=2;
            } else {
                elem*=10;
            }
            System.out.print(elem+" ");
        }
    }
}