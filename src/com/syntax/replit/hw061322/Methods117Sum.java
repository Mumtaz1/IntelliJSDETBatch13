package com.syntax.replit.hw061322;

public class Methods117Sum {

    /*
    Create a method with the following specs:
    Returns:
    an integer
    Name:
    sumEvenToX
    Parameters:
    an integer called "x"
    Purpose:
    calculate the sum of the EVEN integers from 1 to x (including x)
    Examples:
    sumEvenToX(5) ==> 6
    sumEvenToX(8) ==> 20
     */

    public static int sumEvenToX(int x) {
        int suma = 0;
        for (int i = 0; i <= x; suma += i, i += 2) ;
        return suma;
    }

    public static void main(String[] args) {
        Methods117Sum even = new Methods117Sum();
        System.out.println(sumEvenToX(5));
        System.out.println(sumEvenToX(8));
    }
}
