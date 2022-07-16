package com.syntax.replit.hw070222;

public class EncapsulationDemo180 {

    /*
    Create class EncapsulationDemo.
    Create two variables as shown below.
    private String empName = John;
    private int empAge = 30;
    Create only getters methods for each variable.
    Print the values for each variable as shown below.
    Expected Output:
    Employee Name: John
    Employee Age: 30
     */

    private String empName = "John";
    private int empAge = 30;

    //getter method for empName
    public String getEmpName() {
        return empName;
    }

    //getter method for empAge
    public int getEmpAge() {
        return empAge;
    }

    public static class EncapsulationDemo180Tester {

        public static void main(String[] args) {
            //creating instance of the encapsulated class
            EncapsulationDemo180 encaps = new EncapsulationDemo180();

            System.out.println("Employee Name: " + encaps.getEmpName());
            System.out.println("Employee Age: " + encaps.getEmpAge());
        }
    }
}