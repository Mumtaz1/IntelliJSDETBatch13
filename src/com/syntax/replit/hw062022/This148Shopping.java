package com.syntax.replit.hw062022;

public class This148Shopping {

    /*
    In ShoppingStore class:
    Create variables as below:
    - item,
    - price,
    - quantity
    Create a constructor to initialize
    instance variables.
    Create a method with name itemTotalPrice.
    Write logic to calculate the total
    value of items in stock and print
    the result. Return the total value.

    In Main class:
    Create two Objects of ShoppingStore
    and pass the parameters to
    constructor. Then using each object
    call the method itemTotalPrice. Store
    the returned value of each object.
    Calculate the sum of both object and
    print the result.
    Output:
    Blanket Total Value 99.98
    Mattress Total Value 439.18
    You purchased 539.16 Today
    Assignment Goals: Clean code, proper
    naming convention, choosing variable
    datatype, this keyword, method creation,
    mathematics operations, method return
    types.
     */

        String item;
        double price;
        int quantity;

        This148Shopping(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
        }
        double itemTotalPrice() {
                double total = price * quantity;
                System.out.println(item + "Total Value " + total);
                return total;
        }
}

