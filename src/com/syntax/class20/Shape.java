package com.syntax.class20;

import static java.lang.Math.PI;

public class Shape {
    /*
    Write a program: Shape class has a constructor
    that takes the radius and has a subclass as
    circle class. In circle class create a
    method to calculate the area of circle.
    Test your code.
     */
int radius;

Shape(int radius) {
    this.radius = radius;
}
}

class Circle extends Shape{

    Circle(int radius) {
        super(radius);
    }
    void printArea(){
        System.out.println((radius * radius) * Math.PI);
    }

    public static void main(String[] args) {
        Circle circle=new Circle(5);
        circle.printArea();
    }
}
