package com.syntax.class22;

public class CreditCardTester {

    public static void main(String[] args) {
        CreditCard credit = new CreditCard();
        credit.calculateInterest(6000, 5.5);

        Visa visa = new Visa();
        visa.calculateInterest(250, 3.0);

        AX ax = new AX();
        ax.calculateInterest(550, 2.0);
    }
}
