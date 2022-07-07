package com.syntax.replit.hw062022;

public class This145Dog {
   /*
   1. Complete the Dog.java class;
      Create following class variables:
      dogName
      dogWeight
      static dogBreed = Mutt;
      For all methods and variables use
      proper naming convention.
      Create constructor to initialize
      instance variables.
   2. In Main class create 2 Objects of
      a Dog class and using each object
      reference variable print details
      of objects.
    Expected Output:
    Tarzan Mutt 50.0
    Lucy Mutt 10.0
    */
    String dogName;
    double dogWeight;
    static String dogBreed = "Mutt";

    This145Dog (String dogName, double dogWeight) {
            this.dogName = dogName;
            this.dogWeight = dogWeight;
    }
}
