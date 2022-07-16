package com.syntax.replit.hw071022;

import java.util.ArrayList;
import java.util.List;

public class List189 {

    /*
    Create a Linked List that will store Integer
    Objects from 50-100.
    Once Linked List is created remove all
    numbers that are not divisible by 3.
    Print Linked List.
    Expected Output
    [51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
     */

    public static void main(String[] args) {
        List<Integer> names = new ArrayList<>();
        for(int i=50; i<100; i++) {
            if (i%3==0) {
                names.add(i);
            }
        }
        System.out.println(names);
    }
}