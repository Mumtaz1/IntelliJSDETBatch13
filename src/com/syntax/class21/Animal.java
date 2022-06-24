package com.syntax.class21;

public class Animal {
    String name;
    String color;
    String breed;
    int age;
    public Animal(String name, String color, String breed, int age) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }
    void printInfo(){
        System.out.println("Name "+name+" color "+color+" Breed"+breed+" age "+age);

    }

}
class Dog extends Animal{

    public Dog(String name, String color, String breed, int age){
        // this.name=name;
        super(name, color, breed, age);
    }
}

class Cat extends Animal{

    public Cat(String name, String color, String breed, int age){
        // You cannot have a print statement before the super statement (41).
        //The rule is it has to come after the super line.
        // System.out.println("Hamid please top trying it will not work"+name);
        super(name, color, breed, age);
        System.out.println("Hamid please stop trying it will not work");
    }
}