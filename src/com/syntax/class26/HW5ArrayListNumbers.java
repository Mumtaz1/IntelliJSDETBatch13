package com.syntax.class26;

import java.util.ArrayList;

public class HW5ArrayListNumbers {
    
    /*
    Create an arrayList of even numbers from 1 to 500. Remove any number that is 
    divisible by 5 from that arrayList.
     */

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(100);
        numbers.add(222);
        numbers.add(350);
        numbers.add(450);
        numbers.add(482);
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 5 == 0) {
                numbers.remove(i);
                numbers.remove(i);
                i--;
            }
        }
        System.out.println(numbers);
    }
}