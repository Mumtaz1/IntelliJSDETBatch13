package com.syntax.class25;

public class HW2Shape {

    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    Test your code.
     */

    //HW2:

    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.calculateArea();
        cir.calculatePerimeter();

        Square square = new Square();
        square.calculateArea();
        square.calculatePerimeter();
    }
}
interface Shape {
    public void calculateArea();
    public void calculatePerimeter();
}
class Circle implements Shape {
    @Override
    public void calculateArea() {
        System.out.println("The area of a circle is: "+ 3.14 * 25);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of a circle is: " + 2 * Math.PI * 5);
    }
}
class Square implements Shape {

    @Override
    public void calculateArea() {
        System.out.println("The area of a square is: " + (3 * 3));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of a square is: " + (2 * 4));
    }
}