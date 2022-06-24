package com.syntax.class19;

public class Teacher {

    /*
    Write a Java program called Teacher.
    Identify features and behavior of that
    Class. Create 3 subclasses MathTeacher,
    ChemistryTeacher, and PianoTeacher
    that would have it their own features
    and behavior. Test all 4 classes.
     */
    String name;
    int yrsOfExperience;
    String degree;

    public void print() {
        System.out.println("Teacher's name is " + name + " and has " + yrsOfExperience + " years of expereince and a " + degree);
    }
}

class MathTeacher extends Teacher {
    MathTeacher(String name, int yrsOfExperience, String degree) {
        this.name = name;
        this.yrsOfExperience = yrsOfExperience;
        this.degree = degree;
    }
}

class ChemistryTeacher extends Teacher {
    ChemistryTeacher(String name, int yrsOfExperience, String degree) {
        this.name = name;
        this.yrsOfExperience = yrsOfExperience;
        this.degree = degree;
    }
}

class PianoTeacher extends Teacher {
    PianoTeacher(String name, int yrsOfExperience, String degree) {
        this.name = name;
        this.yrsOfExperience = yrsOfExperience;
        this.degree = degree;
    }

    public static void main(String[] args) {
        MathTeacher mt = new MathTeacher("Jane", 5, "PhD");
        mt.print();
        ChemistryTeacher ct = new ChemistryTeacher("John", 12, "BS");
        ct.print();
        PianoTeacher pt = new PianoTeacher("Penny", 3, "AA");
        pt.print();
    }
}