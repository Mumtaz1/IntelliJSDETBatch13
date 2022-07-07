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
    - non argument constructor
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

    //Default constructor aka non argument constructor
    This146ParamVsNonArgu() {

    }

    //Parameterized constructor
    This146ParamVsNonArgu(String name, String lastName, int employeeID, String startDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.startDate = startDate;
        this.salary = salary;
    }

    String printValues() {
        return name + " " + lastName + " " + employeeID + " " + startDate + " " + salary;
    }
}
