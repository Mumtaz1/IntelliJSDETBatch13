package com.syntax.class25;

public abstract class Vehicle {

    /*
    Create a Class Vehicle that would have the following fields: vehiclePrice and method calculateSalePrice()
    which should be returning a price of the Vehicle.
    Create 2 subclasses: Sedan and Truck.
    The Truck class has field as weight and has its own implementation of calculateSalePrice() method in
    which returned price calculated as following: if weight > 2000 then returned price of car should include
    10% discount, otherwise 20% discount.
    The Sedan class has field as length and also does its own implementation of calculateSalePrice(): if length
    of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
     */

        //HW4:
        double vehiclePrice;
        abstract double calculateSalePrice();
        }
    class Truck extends Vehicle {
        double weight;
        Truck(double weight, double vehiclePrice) {
            this.weight = weight;
            this.vehiclePrice = vehiclePrice;
        }
        @Override
            double calculateSalePrice() {
            if (weight > 2000) {
                vehiclePrice = (vehiclePrice * 10) / 100;
        //        System.out.println("The price of the truck includes a 10% discount " + discountPrice);
            } else {
                vehiclePrice = (vehiclePrice * 20) / 100;
        //        System.out.println("The price of the truck includes a 20% discount " + discountPrice);
            }
            return vehiclePrice;
        }
    }
    class Sedan extends Vehicle {
        double length;
        public Sedan(double length, double vehiclePrice) {
            this.length = length;
            this.vehiclePrice = vehiclePrice;
        }
            @Override
            double calculateSalePrice () {
                if (length > 20) {
                    vehiclePrice = (vehiclePrice * 5) / 100;
                } else {
                    vehiclePrice = (vehiclePrice * 10) / 100;
                }
                return vehiclePrice;
            }
        }
        class TestVehicle {
            public static void main(String[] args) {
                Sedan sedan = new Sedan(30,60000);
                System.out.println("The price of the Sedan is $" + sedan.vehiclePrice + " but we will give " +
                        "you a discount of $" + sedan.calculateSalePrice());

                Truck truck = new Truck(400,55000);
                System.out.println("The price of the Truck is $" + truck.vehiclePrice + " but we will give " +
                        "you a discount of $" + truck.calculateSalePrice());
            }
        }