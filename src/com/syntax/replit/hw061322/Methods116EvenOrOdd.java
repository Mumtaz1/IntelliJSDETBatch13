package com.syntax.replit.hw061322;

public class Methods116EvenOrOdd {

    /*
    Create a method that will accept 2 numbers as
    parameters and return true if both numbers are
    even otherwise return false.
    (Return false if one or both given numbers are
    not even).
    Examples:
    - bothEven(4,6) => true
    - bothEven(3,4) => false
    - bothEven(-1,1) => false
    Expected Output:
    false
     */
    public boolean checkNo(int num1, int num2) {
        if (num1 % 2 == 0 && num2 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Methods116EvenOrOdd result = new Methods116EvenOrOdd();
        System.out.println(result.checkNo(4, 6));
        System.out.println(result.checkNo(3, 4));
        System.out.println(result.checkNo(-1, 1));

    }
}
