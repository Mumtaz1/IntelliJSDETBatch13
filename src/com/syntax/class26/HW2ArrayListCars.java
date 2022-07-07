package com.syntax.class26;

import java.util.ArrayList;

public class HW2ArrayListCars {

    /*
    Create an arrayList of cars and retrieve all the values using 3 different ways
     */
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Porsche");

        System.out.println("1st way of retrieving all the values in the array List");
        System.out.println(cars);

        System.out.println("2nd way of retrieving all the values in the array list");
        for (int i = 0; i < cars.size(); i ++) {
            System.out.println(cars.get(i));
        }

        System.out.println("3rd way of retrieving all the values in the array list");
        System.out.println("cars = " + cars);

    }
}