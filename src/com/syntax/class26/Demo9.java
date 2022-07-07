package com.syntax.class26;

import java.util.ArrayList;

public class Demo9 {

    public static void main(String[] args) {
        Integer number = 10;
        System.out.println(Integer.MAX_VALUE);
        int num = Integer.parseInt("20"); //if number is present in the form of String
        // using this method we can convert it to its original type
        System.out.println(num);
        System.out.println(Integer.MIN_VALUE);
        int number1 = 15;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(number1);  //auto boxing - primitive to non-primitive
        System.out.println("numbers = " + numbers);  //unboxing
        int number3 = numbers.get(0);  //auto unboxing - non-primitive to primitive
        new Integer(15); //boxing
    }
}
