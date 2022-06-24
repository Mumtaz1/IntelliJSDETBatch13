package com.syntax.class18;

public class HW1Array {

    /*
    Create a method that will accept an array
    as parameters and will return a sum of all
    elements from that array. Method should be
    visible only within the same package and
    accessible by the creating an instance of
    the class.
     */

    int sumElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i ++) {
            sum+= arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        HW1Array num = new HW1Array();
        int[] arr = {10, 5, 20};
        System.out.println("Sum of array is: " + num.sumElements(arr));  //35
    }
}
