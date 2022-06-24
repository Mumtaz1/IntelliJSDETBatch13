package com.syntax.replit.hw062022;

import com.syntax.class20.UserClass;

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

    static class DogInfo extends This145Dog {
        public DogInfo(String name, int mobileNum, String address) {
            this.dogName = dogName;
            this.dogWeight = dogWeight;
            this.dogBreed = dogBreed;
        }
    }
    void info() {
        System.out.println(dogName + dogBreed + dogWeight);
    }
/*
    public static void main(String[] args) {
        This145Dog dog1 = new This145Dog("Tarzan", "Mutt", 50.0);  // there is an error on this line
        dog1.info();

        This145Dog dog2 = new This145Dog("Lucy", "Mutt", 10.0); // there is an error on this line
        dog2.info();
    }    */
}
