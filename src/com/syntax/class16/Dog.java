package com.syntax.class16;

public class Dog {

    String name;
    String color;
    static int noOfLegs = 4;
    public static void main(String[] args) {
        Dog dog1 = new Dog();  //creating an object of a Dog class
        dog1.name = "Tomy";
        dog1.color = "Pink";

        Dog dog2 = new Dog();  //creating an object of a Dog class
        dog2.name = "Fido";
        dog2.color = "Black";

        Dog dog3 = new Dog();  //creating an object of a Dog class
        dog3.name = "Jajaja";
        dog3.color = "White";

        System.out.println(dog1.name); // Jajaja because we made name on line 5 as a static variable
        System.out.println(dog2.name); // Jajaja because we made name on line 5 as a static variable
        System.out.println(dog3.name); // Jajaja because we made name on line 5 as a static variable
        //So we removed the static keyword infront of line 5 static String name; to just String name;
        System.out.println(dog3.color); //white. It will never print pink or Black.


    }
}