package com.syntax.replit.hw071022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListScanner188 {

    /*
    Using Scanner class add 5 elements into ArrayList
    and then print all elements from that ArrayList
    all in 1 line.
    Numbers in:
    4
    62
    8
    5
    4
    Expected Output:
    4 62 8 5 4
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        ArrayList <Integer> arrayList = new ArrayList <> ();
        arrayList.add (input.nextInt()); //so enter 4
        arrayList.add (input.nextInt()); //so enter 62
        arrayList.add (input.nextInt()); //so enter 8
        arrayList.add (input.nextInt()); //so enter 5
        arrayList.add (input.nextInt()); //so enter 4
        for (int i = 0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
