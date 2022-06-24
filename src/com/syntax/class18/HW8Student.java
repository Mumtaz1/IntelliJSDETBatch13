package com.syntax.class18;

public class HW8Student {

    /*
    Write a Student class that has instance variables
    name and address. Create a constructor that will
    initialize those variables. Print name & address
    of given student using displayInfo method.
     */
    String name;
    String address;

    HW8Student(String name, String address) {
        this.name = name;
        this.address = address;
    }
    void displayInfo() {
        System.out.println(name + " lives in " + address);
    }

    public static void main(String[] args) {
        HW8Student student = new HW8Student("John", "California");
        student.displayInfo();
    }
}
