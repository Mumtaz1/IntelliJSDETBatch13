package com.syntax.replit.hw070222;

class EncapsulationDemo178 {

    /*
    Encapsulation
    Create class EncapsulationDemo
    Create two variables as shown below:
    private String empName;
    private int empAge;
    Create the getter/setter methods for each variable.
    In Main class and main method.
    Using setter methods assign the values as "John" and "30"
    Using getter methods print the values as below outputs.
    Expected Output:
    Employee Name: John
    Employee Age: 30
     */

    private String empName;
    private int empAge;

    //getter method for empName
    public String getEmpName() {
        return empName;
    }
    //setter method for empName
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    //getter method for empAge
    public int getEmpAge() {
        return empAge;
    }
    //setter method for empAge
    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}