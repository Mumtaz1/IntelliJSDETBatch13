package com.syntax.replit.hw062022;

public class This148ShoppingTester {
    public static void main(String[] args) {
        This148Shopping item1 = new This148Shopping("Blanket ", 49.99, 2);
        double item1Total = item1.itemTotalPrice();

        This148Shopping item2 = new This148Shopping("Mattress ", 219.59, 2);
        double item2Total = item2.itemTotalPrice();
        System.out.println("You purchased " + (item1Total + item2Total) + " Today");
    }
}
