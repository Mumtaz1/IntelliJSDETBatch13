package com.syntax.class25;

public abstract class HW3Marks {

    /*
    We have to calculate the average of marks obtained in three subjects by student A
    and in 4 subjects by student B.
    Create class 'Marks' with an abstract method 'getAverage' that will be returning
    the average of marks. Provide implementation of abstract method in classes 'A' and 'B'.
    The constructor of student A takes the marks in three subjects as its parameters and
    the marks in four subjects as its parameters for student B.
    Test your code.
     */

    //HW3:

    public static void main(String[] args) {
        A student1 = new A(75, 80, 95);
        System.out.println("Student A's average grade for the 3 subjects is: " + student1.getAverage());

        B student2 = new B(80, 85, 95, 100);
        System.out.println("Student B's average grade for the 4 subjects is: " + student2.getAverage());
    }
}
abstract class Marks {
    protected int biology;
    protected int chemistry;
    protected int physics;
    protected int zoology;

    abstract int getAverage();
}
class A extends Marks {
    int biology;
    int chemistry;
    int physics;

    public A(int biology, int chemistry, int physics) {
        this.biology = biology;
        this.chemistry = chemistry;
        this.physics = physics;
    }
    @Override
    int getAverage() {
        return (biology + chemistry + physics) / 3;
    }
}
class B extends Marks {
    public B(int biology, int chemistry, int physics, int zoology) {
        super.biology = biology;
        super.chemistry = chemistry;
        super.physics = physics;
        super.zoology = zoology;
    }
    @Override
    int getAverage() {
        return (biology + chemistry + physics + zoology) / 4;
    }
}