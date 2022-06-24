package com.syntax.class21;

public class HW3StaticOverLoading {

    /*
    Create 1 class with a static method that
    has 3 overloaded forms. Then call each
    overloaded method with specific
    arguments and observe result.
     */
    static void vegetables(String name) {
        System.out.println(name + " is healthy for you ");
    }
    static void vegetables(String name, String vitamin) {
        System.out.println(name + " is healthy for you it contains vitamin " +vitamin);
    }
    static void vegetables(String name, String vitamin, String benefit) {
        System.out.println(name + " are healthy for you it contains vitamin " +vitamin+ " and helps with " +benefit);
    }

    public static void main(String[] args) {
        HW3StaticOverLoading overload = new HW3StaticOverLoading();
        overload.vegetables("Broccoli");
        overload.vegetables("Spinach", "A");
        overload.vegetables("Carrots", "K","vision");

    }
}
