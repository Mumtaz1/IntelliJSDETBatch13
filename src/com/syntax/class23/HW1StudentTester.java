package com.syntax.class23;

public class HW1StudentTester {

    public static void main(String[] args) {
        HW1Student[] student = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (HW1Student s : student) {
            s.listen();
            s.read();
            s.homework();
        }
    }
}