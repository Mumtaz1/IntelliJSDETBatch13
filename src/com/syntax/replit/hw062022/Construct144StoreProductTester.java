package com.syntax.replit.hw062022;

public class Construct144StoreProductTester {

    public static void main(String[] args) {
        Construct144StoreProduct prod1 = new Construct144StoreProduct("Eggs", 3.0,
                "Produce", true, 10);
        prod1.display();
        Construct144StoreProduct prod2 = new Construct144StoreProduct("Paper Towels", 2.0, 24);
        prod2.display();

        Construct144StoreProduct prod3 = new Construct144StoreProduct("Paper Towels", 2.0);
        prod3.display();
    }
}
