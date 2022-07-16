package com.syntax.replit.hw071022;

import java.util.ArrayList;

public class List186Remove {

    /*
    ArrayList Remove
    Create an Arraylist of type Integer.
    Add below elements to it.
    111
    222
    333
    444
    555
    666
    Print the ArrayList.
    Remove all the elements.
    Print the ArrayList.
    Expected Output:
    [111, 222, 333, 444, 555, 666]
    []
     */
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(111);
        integers.add(222);
        integers.add(333);
        integers.add(444);
        integers.add(555);
        integers.add(666);
        System.out.println(integers);
        integers.clear();
        System.out.println(integers);
    }
}