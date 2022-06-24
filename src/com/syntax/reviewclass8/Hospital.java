package com.syntax.reviewclass8;

public class Hospital {

    public static void main(String[] args) {
        Doctor doc = new Doctor("Jane", "Smith");  //call to constructor
        doc.printInfo(); // calling a method
        Doctor.hospital = "UCSF"; //access static variable
        doc.work();
        System.out.println("-------------");

        //creating another doctor
        Doctor doctor = new Doctor("Joe", "Doe", "Cardiologist", 10);  //call to constructor
        doctor.printInfo(); // calling a method
        doctor.work();

        System.out.println("Changing value of static variable ");
        Doctor.hospital = "George Washington";
        doc.work(); // Doctor Smith works at George Washington
        doctor.work();

        System.out.println("Changing value of instance variable");
        doc.lastName = "Obama";
        doc.printInfo();
        doctor.printInfo();
        doc.hospital = "Mayo Clinic";

        System.out.println("                 ");
        doc.work();
        doctor.work();

        System.out.println(" ---");
        doctor.treat("Samantha");

        //accessing static method
        Doctor.study("GTU");

    }
}

