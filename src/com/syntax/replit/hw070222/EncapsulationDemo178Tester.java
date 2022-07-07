package com.syntax.replit.hw070222;

public class EncapsulationDemo178Tester {

    public static void main(String[] args) {
        //creating instance of the encapsulated class
        EncapsulationDemo178 encaps = new EncapsulationDemo178();
        //setting values through setter methods;
        encaps.setEmpName("John");
        encaps.setEmpAge(30);

        System.out.println("Employee Name: " + encaps.getEmpName());
        System.out.println(("Employee Age: " + encaps.getEmpAge()));

    }
}
