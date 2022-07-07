package com.syntax.class23;

public class HW1Student {

    /*
    Create a class Student that will have 3
    subclasses as SyntaxStudent, CollegeStudent,
    SchoolStudent.
    - Define common behavior within parent class
      and override some of the methods in child classes.
    - Define some methods specific to child classes.
    - Write example of achieving run time polymorphism
     */

    public void listen() {
        System.out.println("Listen to class lecture");
    }

    public void read() {
        System.out.println("Read assigned books");
    }

    public void homework() {
        System.out.println("Do homework");
    }
}

class SyntaxStudent extends HW1Student {
    @Override
    public void listen() {
        System.out.println("Syntax students listen to the instructor");
    }

    @Override
    public void read() {
        System.out.println("Syntax students need to read assigned books");
    }

    @Override
    public void homework() {
        System.out.println("Syntax students get tons of homework");
    }
}

class CollegeStudent extends HW1Student {

    @Override
    public void listen() {
        System.out.println("College students need to pay attention to their professor");
    }

    @Override
    public void read() {
        System.out.println("College students are assigned a lot of reading");
    }

    @Override
    public void homework() {
        System.out.println("Do homework");
    }
}

class SchoolStudent extends HW1Student {

    @Override
    public void listen() {
        System.out.println("School students must listen to their teacher if they want to do well");
    }

    @Override
    public void read() {
        System.out.println("School students have to read a lot of books to cover all their subjects");
    }

    @Override
    public void homework() {
        System.out.println("Good school students complete their homework on time");
    }
}