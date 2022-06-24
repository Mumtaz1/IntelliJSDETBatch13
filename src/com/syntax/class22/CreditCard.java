package com.syntax.class22;

public class CreditCard {

    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the
    given balance.
    - Create 2 subclasses: Visa and AX. In AX class override method
      calculate interest.
    - Call the method by creating an object of each of the three classes.
     */

  //Something is not quite right. It prints out 2 lines of l23.

  //HW2:
    double balance;
    double interest;

    void calculateInterest(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
        System.out.println("The interest you owe is: " + balance * (interest/ 100));
    }
}
    class Visa extends CreditCard {

    }

    class AX extends CreditCard {
        @Override
        void calculateInterest(double balance, double interest) {
            this.balance = balance;
            this.interest = interest;
            System.out.println("The interest you own on your AX is: " + balance * (interest/ 100));
        }
    }