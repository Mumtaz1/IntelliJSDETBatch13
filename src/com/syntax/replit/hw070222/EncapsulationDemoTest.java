package com.syntax.replit.hw070222;

class EncapsulationDemo {

    /*
    Encapsulation
    Create class EncapsulationDemo that will have 2 variables
    empName and empAge. Create the getter/setter methods
    for each variable.
    In Main class and main method
    Using setter methods assign the values as "Mario" and "32".
    Using getter methods print the values as below outputs.
    Expected Output:
    Employee Name: Mario
    Employee Age: 32
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
public class EncapsulationDemoTest {

    public static void main(String[] args) {
        //creating instance of the encapsulated class
        EncapsulationDemo encaps = new EncapsulationDemo();
        //setting values through setter methods;
        encaps.setEmpName("Mario");
        encaps.setEmpAge(32);

        System.out.println("Employee Name: " + encaps.getEmpName());
        System.out.println(("Employee Age: " + encaps.getEmpAge()));
    }
}