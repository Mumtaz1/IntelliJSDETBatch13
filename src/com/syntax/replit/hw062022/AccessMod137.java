package com.syntax.replit.hw062022;

public class AccessMod137 {

    /*
    In main class please declare the variables
    using different access modifiers that will
    hold value for:
    - name
    - city
    - name of the school
    - batch number
    Create a method to display details in the
    following format:
    My name is _ and I live in _. I study at _
    in batch _
    Assign values to the variables and execute
    method display.
    Expected Output:
    My name is John and I live in Miami. I study
    at Syntax in batch 9.
     */

    public String name;
    String city;
    private String school;
    protected int batchNo;

    AccessMod137(String name, String city, String school, int batchNo) {
        this.name = name;
        this.city = city;
        this.school = school;
        this.batchNo = batchNo;
    }

    void displayInfo() {
        System.out.print("My name is " +name+ " and I live in " +city+ ". I study at " +school+ " in batch " +batchNo);
    }

    public static void main(String[] args) {
        AccessMod137 obj = new AccessMod137("John", "Miami", "Syntax", 9);
        obj.displayInfo();
    }
}