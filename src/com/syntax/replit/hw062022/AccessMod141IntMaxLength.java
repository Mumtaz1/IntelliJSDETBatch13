package com.syntax.replit.hw062022;

public class AccessMod141IntMaxLength {

    /*
    Create the maxValue method that will
    accept int array and return the maximum
    value in the array.
    Method should be visible in every class
    in any package!
    Expected Output:
    22
     */

    public static int maxValue(int[] array) {
        int maxValue = array[0];
        int largestLength = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }
}
