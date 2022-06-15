package com.syntax.class16;

public class SyntaxEmployee {

    /*
    Create a Class called SyntaxEmployee.
    - Create three variables empID, salary and set the CEO to "Sumair"
    - Create two objects of the class SyntaxEmployee
    - Set the value of eID, salary for each of the objects.
    - Print out the eID, salary and CEO for each of the objects.
     */

    int empID;
    double salary;
    static String ceo = "Sumair";


    public static void main(String[] args) {

        SyntaxEmployee sEmp1 = new SyntaxEmployee();
        sEmp1.empID = 1;
        sEmp1.salary = 150000;

        SyntaxEmployee sEmp2 = new SyntaxEmployee();
        sEmp2.empID = 2;
        sEmp2.salary = 180000;

        System.out.println("Employee ID: " + sEmp1.empID + " salary is: " + sEmp1.salary + " and the CEO is " + ceo );
        System.out.println("Employee ID: " + sEmp2.empID + " salary is: " + sEmp2.salary + " and the CEO is " + ceo );
    }
}
