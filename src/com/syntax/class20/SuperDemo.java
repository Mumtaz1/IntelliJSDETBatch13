package com.syntax.class20;

public class SuperDemo {

    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.printColor();
    }
}
class Wood {
    String color = "Blue"; //this will not be printed since Chair goes to the nearest parent which is Furniture.
}
class Furniture extends Wood {
    String color = "Black";
}
class Chair extends Furniture {
    String color = "grey";
    void printColor() {
        String color = "White";
        System.out.println(color);  //White
        //Always local variables are preferred.
        System.out.println(this.color); //grey
        System.out.println(super.color); //Black got it from super class Furniture. If you don't
        //use super. then it will print White.
    }
}