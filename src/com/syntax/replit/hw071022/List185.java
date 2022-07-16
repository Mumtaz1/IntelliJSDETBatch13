package com.syntax.replit.hw071022;

import java.util.ArrayList;
import java.util.List;

public class List185 {

    /*
    ArrayList Loop
    Create an arrayList of type Integer.
    Add below values:
    111
    111
    111
    999
    999
    999
    Print all the values of List 1 by 1:
    Expected Output:
    111
    111
    111
    999
    999
    999
     */
    public static void main(String[] args) {
        ArrayList<Integer> integer = new ArrayList<>();
        integer.add(111);
        integer.add(111);
        integer.add(111);
        integer.add(999);
        integer.add(999);
        integer.add(999);
        for (Integer integers : integer) {
            System.out.println(integers);
        }
    }
}
