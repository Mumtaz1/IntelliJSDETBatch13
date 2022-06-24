package com.syntax.class18;

public class HW7StaticConstructor {

    /*
    Write a program that have static constructor
    and observe result.
     */
    String name;
    String gender;

    HW7StaticConstructor(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
    void displayInfo() {

        System.out.println(name + " " + gender);
    }

    public static void main(String[] args) {
        HW7StaticConstructor family = new HW7StaticConstructor("Mary", "Female");
        family.displayInfo();
    }
}
