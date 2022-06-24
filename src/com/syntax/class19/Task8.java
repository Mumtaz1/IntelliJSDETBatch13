package com.syntax.class19;

public class Task8 {

     /*
    Write a Student class that has instance variables
    name and address. Create a constructor that will
    initialize those variables. Print name & address
    of given student using displayInfo method.
     */
    //We will use Task8 instead of Student for class name since we already have a Student class.

    String name;
    String address;

    Task8(String name, String address) {
        this.name = name;
        this.address = address;
    }
    void displayInfo() {
        System.out.println(name + " " + address);
    }
    public static void main(String[] args) {
        Task8 task8 = new Task8("Joe", "street 123");
        task8.displayInfo();
    }
}
