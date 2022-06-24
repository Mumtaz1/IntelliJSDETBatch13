package com.syntax.replit.hw062022;

public class This146ParamVsNonArgu {

    /*
    1. Complete the Employee.java class:
    Include the following class variables:
    - name(String)
    - lastName(String)
    - employeeID(int)
    - startDate(String)
    - salary(int)
    Write two constructors:
    - non-argument constructor
    - parameterized constructor
    Create two different objects of the
    Employee class using both
    constructors and print the values of
    the properties inline using a print
    method.
    Output:
    null null 0 null 0
    Joe Smith 12345 01/01/1970 35000
     */
    String name;
    String lastName;
    int employeeID;
    String startDate;
    int salary;
/*
    This146ParamVsNonArgu(String name, String lastName, int employeeID, String startDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.startDate = startDate;
        this.salary = salary;
    }

    public static void main(String[] args) {
        This146ParamVsNonArgu emp = new This146ParamVsNonArgu();
        System.out.println(emp.name + " " + emp.lastName + " " + emp.employeeID + " "
                + emp.startDate + " " + emp.salary);

        This146ParamVsNonArgu emp1 = new This146ParamVsNonArgu("Joe", "Smith",
                12345, "01/01/1970, 35000");
        System.out.println(emp1.name + " " + emp1.lastName + " " + emp1.employeeID + " "
                + emp1.startDate + " " + emp1.salary);
    } //error on line 40 and 44-45. */
}