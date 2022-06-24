package com.syntax.replit.hw061322;

import com.syntax.replit.hw062022.Construct143Car;

import static java.lang.Math.PI;

public class Tossit {

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

        /*
        String make;
        String model;
        String numberOfDoors;
        //  int numberOfDoors;
        int topSpeed;
        double price;

        Construct143Car(String make, String model, String numberOfDoors, int topSpeed, double price) {
                this.make = make;
                this.model = model;
                this.numberOfDoors = numberOfDoors;
                this.topSpeed = topSpeed;
                this.price = price;
        }

        Construct143Car(String make, String model, int topSpeed, double price) {
                this.make = make;
                this.model = model;
                this.topSpeed = topSpeed;
                this.price = price;
        }

        Construct143Car(int numberOfDoors, int topSpeed, double price) {
                this.topSpeed = topSpeed;
                this.price = price;
        }

        Construct143Car(String make, String model, int numberOfDoors) {
                this.make = make;
                this.model = model;
        }

        void display() {
                System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
        }

        public static void main(String[] args) {
                Construct143Car car1 = new Construct143Car("Toyota", "Prius", "4", 120, 30000.0);
                car1.display();

                Construct143Car car2 = new Construct143Car("Toyota", "Prius", "4", 120, 30000.0);
                car2.display();

                Construct143Car car3 = new Construct143Car("unknown", "unknown", "4", 120, 30000.0);
                car3.display();

                Construct143Car car4 = new Construct143Car("Toyota", "Prius", "", 4,  90.0);
                car4.display();  //it's printing a 0 after Prius. So, I changed numberOfDoors from int to String but now
                //I get Toyota Prius  4 90 0.0 (there is a blank space between Prius and 4).
        } */
}



