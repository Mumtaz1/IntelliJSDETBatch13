package com.syntax.class15;


public class ArrayUtils {

    //Note the main method for this program is in MD2.java

    void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }
    int sumArray(int [] arr) {
        int sum = 0;
        for(int num : arr) {
            sum = sum + num;
        }
        return sum;
    }
}
