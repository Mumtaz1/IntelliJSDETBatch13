package com.syntax.replit.hw062022;

public class Inherit150 {

    /*
    Crete four classes (Person, Employee, Student,
    Retiree).
    Have properties:
    For Person: name(String)
    For Person: lastName(String)
    For Person: age(int)
    For Employee: salary(int)
    For Student: grade(int)
    For Retiree: seniorActivity(String)
    At Employee, Student, Retiree Class have
    a print method in each that prints the
    properties in line as showin in the
    output.
    Create multilevel inheritance: Person -->
    Employee --> Student --> Retiree
    From your Main class create objects of
    the Employee, Student and Retiree classes
    and call the print method.
    Expected Output:
    Joe Smith 35 35000
    Adam Smith 15 10
    Frank Smith 15 tour
     */

    public static void main(String[] args){
        Employee person1 = new Employee();
        person1.name = "Joe";
        person1.lastName = "Smith";
        person1.age = 35;
        person1.salary = 35000;
        person1.printValuesEmployee();

        Student person2 = new Student();
        person2.name = "Adam";
        person2.lastName = "Smith";
        person2.age = 15;
        person2.grade = 10;
        person2.printValuesStudent();

        Retiree person3 = new Retiree();
        person3.name = "Frank";
        person3.lastName = "Smith";
        person3.age = 15;
        person3.seniorActivity = "tour";
        person3.printValuesRetiree();
    }
}
class Person{
    String name;
    String lastName;
    int age;
}
class Employee extends Person{
    int salary;
    void printValuesEmployee(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}
class Student extends Employee{
    int grade;
    void printValuesStudent(){
        System.out.println(name+" "+lastName+" "+age+" "+grade);
    }
}
class Retiree extends Student{
    String seniorActivity;
    void printValuesRetiree(){
        System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
    }
}