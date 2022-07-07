package com.syntax.class25;


public interface Animal {

    void sleep();
    void eat();


}
interface Dog extends Animal {
    void Bark();
}

class Husky implements Dog  {

    @Override
    public void sleep() {
        System.out.println("Sleeps 4 hours");
    }

    @Override
    public void eat() {
        System.out.println("Likes to eat");
    }

    @Override
    public void Bark() {
        System.out.println("Likes to bark");
    }
}