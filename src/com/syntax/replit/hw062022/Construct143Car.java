package com.syntax.replit.hw062022;

public class Construct143Car {

    /*
    1. Complete the Car.java class:
       Create the following variables (Choose
       proper datatype):
       - make
       - model
       - numberOfDoors
       - topSpeed
       - price
       following the proper naming convention
       for variables, write 4 constructors:
       - The 1st constructor (with all parameters).
       - The 2nd constructor has all parameters
         ** except numberOfDoors.
         (**numberOfDoors value should assign to
         4 inside constructor).
       - The 3rd constructor should have all
         parameters except make and model.
         **(**make and model value should assign to
         "unknown" inside constructor).
       - The 4th constructor should have all
         parameters except topSpeed and price;
         **(**topSpeed value should assign to "90"
         and price value should be assigned to 0
         inside the constructor).
       Create a display method in Cars class to print
       the class variable value in console.
    2. Test your code with the Main.java class:
       Create several Car objects using all
       constructors. Then call display method
       with each object.
     Output:
     Toyota Prius 4 120 30000.0
     Toyota Prius 4 120 30000.0
     unknown unknown 4 120 30000.0
     Toyota Prius 4 90.0
     */

    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;
    Construct143Car(String make, String model, int numberOfDoors, int topSpeed, double price){
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }
    Construct143Car(String make, String model, int topSpeed, double price){
        this.make = make;
        this.model = model;
        this.numberOfDoors = 4;
        this.topSpeed = topSpeed;
        this.price = price;
    }
    Construct143Car(int numberOfDoors, int topSpeed, double price){
        this.make = "unknown";
        this.model = "unknown";
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }
    Construct143Car(String make, String model, int numberOfDoors){
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = 90;
        this.price = 0;
    }
    String displayData(){
        return make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price;
    }
}
