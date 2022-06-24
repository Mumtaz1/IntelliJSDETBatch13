package com.syntax.class20;

public class Vehicle {

    // This is an example of a multi-level inheritance.
    int engineHP;
    String make;
    String model;
    String color;
}

class Car extends Vehicle {
    String steeringType;
    boolean autoPilot;
    int noOfWindows;

    void printBasicInfo() {
        engineHP = 500;
        System.out.println(engineHP);
    }
}

class BMW extends Car {
    int topSpeed;

    void printBasicInfo() {
        engineHP = 500;
        System.out.println(engineHP);
    }
}