package com.syntax.replit.hw071022;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List191Boolean {
    /*
    Create an ArrayList of type boolean called
    listA and add below values
    (true, false, false)
    Create another array list called listB and
    add all values from List A into it.
    Using iterator print all values from ListB
    1 by 1.
    Expected Output:
    true
    false
    false
     */
    public static void main(String[] args) {
        List<Boolean> listA = new LinkedList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);

        List<Boolean> listB = new LinkedList<>();
        listA.addAll(listB);

        Iterator<Boolean> iterator = listA.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}