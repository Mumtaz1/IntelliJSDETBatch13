package com.syntax.class18;

public class HW5AvgGrade {
    /*
    Write a Java class Students that have a
    constructor which takes students name
    and 3 subject grades. Inside your class
    also have a method to Calculate Average
    Grade. Test Student class for 5 different
    students with different marks. Your
    program should print an average mark of
    each student's name.
    NOTE: please use different names for
    instance and local variables.
     */
    String name;
    int grade1;
    int grade2;
    int grade3;

    HW5AvgGrade(String name, int grade1, int grade2, int grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }
    int avgGrade() {
        return (grade1 + grade2 + grade3) / 3;
    }

    public static void main(String[] args) {
        HW5AvgGrade stu1 = new HW5AvgGrade("Jane", 66, 76, 86);
        System.out.println(stu1.name + " average grade is: " + stu1.avgGrade());
        HW5AvgGrade stu2 = new HW5AvgGrade("John", 72, 82, 92);
        System.out.println(stu2.name + " average grade is: " + stu2.avgGrade());
        HW5AvgGrade stu3 = new HW5AvgGrade("Jack", 55, 65, 75);
        System.out.println(stu3.name + " average grade is: " + stu3.avgGrade());
        HW5AvgGrade stu4 = new HW5AvgGrade("Mary", 81, 91, 100);
        System.out.println(stu4.name + " average grade is: " + stu4.avgGrade());
        HW5AvgGrade stu5 = new HW5AvgGrade("Fred", 88, 100, 98);
        System.out.println(stu5.name + " average grade is: " + stu5.avgGrade());

    }
}