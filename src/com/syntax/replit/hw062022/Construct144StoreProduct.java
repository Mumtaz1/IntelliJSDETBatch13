package com.syntax.replit.hw062022;

public class Construct144StoreProduct {

    /*
    Step 1: Complete the StoreProduct.java class:
    Create below instance variables. (Choose
    proper datatype and naming convention for
    variable)
    - label
    - price
    - category
    - hasExpiration
    - stock (represent the stock quantity)

    Step 2: Write 3 constructors:
    - The main constructor (with all
      parameters)
    - 2nd constructor with all except category
      and hasExpiration (category defaults to
      "misc", hasExpiration defaults to 0
      inside the constructor).
    - 3rd constructor all the parameters
      except category, expiration, and stock
      (stock default to 0, inside the
      constructor).

    Step 3: Method for display output.
    In StoreProduct class create a method to
    display the output of class variables.
    (Output sequence as order of variable
    shown above. All in one line).

    Step 4: In Main class create an object of
    StoreProduct class with each constructor's.
    Pass the values and then call the display
    method.

    Step 5: Execute your application.

    Hint: Each variable must be object specific.
    Output:
    Eggs 3.0 Produce true 10
    Paper Towels 2.0 misc false 24
    Paper Towels 2.0 null false 0
    */

    String label, category;
    double price;
    boolean hasExpiration;
    int stock;

    Construct144StoreProduct(String label, double price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    Construct144StoreProduct(String label, double price, int stock) {
        this.label = label;
        this.price = price;
        this.stock = stock;
    }

    Construct144StoreProduct(String label, double price) {
        this.label = label;
        this.price = price;
    }

    void display() {
        System.out.print(label + " " + price + " " + category + " " + hasExpiration + " " + stock);
    }

    public static void main(String[] args) {
        Construct144StoreProduct prod1 = new Construct144StoreProduct("Eggs", 3.0,
                "Produce", true, 10);
        System.out.println();
        prod1.display();
        Construct144StoreProduct prod2 = new Construct144StoreProduct("Paper Towels", 2.0,
                    "misc", false, 24);
        System.out.println();
        prod2.display();

        Construct144StoreProduct prod3 = new Construct144StoreProduct("Paper Towels", 2.0,
                    "null", false, 0);
        System.out.println();
        prod3.display();

    }
}
