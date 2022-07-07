package com.syntax.replit.hw062022;

public class This147carStockValue {

    /*
    Create instance variable as below:
    - model,
    - price,
    - quantity
    Create a constructor that will initialize
    instance variables.
    Create a method with name carStockValue.
    Write logic to calculate the total values
    of cars in stock and print the result.
    Run the application in Main class.
    Expected Output:
    Toyota 2019 Stock Value 250000.0
    BMW 2019 Stock Value 652980.0
     */

    String model;
    double price;
    int quantity;
    static int year = 2019;

    This147carStockValue(String model, double price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    void carStockValue(){
        System.out.println(model+" "+year+" Stock Value "+price*quantity);
    }
}
