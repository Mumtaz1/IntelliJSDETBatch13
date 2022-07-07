package com.syntax.replit.hw062022;

public class Construct143CarTester {

    public static void main(String[] args) {
        Construct143Car car1 = new Construct143Car("Toyota", "Prius", 4, 120, 30000.0);
        car1.displayData();
        System.out.println(car1.displayData());

        Construct143Car car2 = new Construct143Car("Toyota", "Prius", 4, 120, 30000.0);
        car2.displayData();
        System.out.println(car2.displayData());

        Construct143Car car3 = new Construct143Car("unknown", "unknown", 4, 120, 30000.0);
        car3.displayData();
        System.out.println(car3.displayData());

        Construct143Car car4 = new Construct143Car("Toyota", "Prius", 4, 90.0);
        car4.displayData();
        System.out.println(car4.displayData());
    }
}
