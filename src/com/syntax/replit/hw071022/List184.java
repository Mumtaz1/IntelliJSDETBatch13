package com.syntax.replit.hw071022;

import java.util.ArrayList;
import java.util.List;

public class List184 {

    /*
    ArrayList
    Create an array list that will hold Integer Objects:
    Add below elements to it.
    111
    222
    333
    444
    555
    666
    Print first, third and fifth element from your array
    Expected Output:
    111
    333
    555
     */

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(111);
        integers.add(222);
        integers.add(333);
        integers.add(444);
        integers.add(555);
        integers.add(666);
        Object[] arr = integers.toArray();
        System.out.println(arr[0]);
        System.out.println(arr[2]);
        System.out.println(arr[4]);
    }
}
