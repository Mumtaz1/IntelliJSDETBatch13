package com.syntax.replit.hw061322;

public class Static129Country {

    /*
    Declare two static variables to hold
    - country name
    - continent
    Create a method to display the value of
    static variables in the following
    format:
    _ located on _ continent
    In the main method assign values to a
    static variable and execute method
    display
    Expected Output:
    Morocco located on Africa continent.
     */
    static String country;
    static String continent;

    //This is a Static Method
    static void disp() {
        System.out.println(country + " located on " + continent + " continent.");
    }

    public static void main(String[] args) {
        country = "Morocco";
        continent = "Africa";
        disp();
    }
}
