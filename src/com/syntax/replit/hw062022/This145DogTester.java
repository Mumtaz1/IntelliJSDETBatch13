package com.syntax.replit.hw062022;

public class This145DogTester {

    public static void main(String[] args) {
        This145Dog dog1 = new This145Dog("Tarzan",50.0);
        System.out.println(dog1.dogName + " " + This145Dog.dogBreed + " " + dog1.dogWeight);

        This145Dog dog2 = new This145Dog("Lucy",10.0);
        System.out.println(dog2.dogName + " " + This145Dog.dogBreed + " " + dog2.dogWeight);
    }
}
