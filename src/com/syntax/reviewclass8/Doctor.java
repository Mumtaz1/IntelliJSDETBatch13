package com.syntax.reviewclass8;

public class Doctor {

    //instance variables
    public String firstName, lastName;
    protected String speciality;
    int experience;
    private double salary;

    //static variable
    public static String hospital;

    public Doctor(String firstName, String lastName) { //local variables
        this.firstName = firstName; //to use instance variable
        this.lastName = lastName; // to use instance variable
    }
    Doctor(String firstName, String lastName, String specialty, int experience) {
        this(firstName, lastName); //has to call current class constructor
        this.speciality = specialty;
        this.experience = experience;
    }
    //creating methods
    public void printInfo() {
        System.out.println("Doctor name is " + firstName + " " + lastName
                + " and speciality is " + speciality);
    }
    //instance accessing both static and
    protected void work() {
        System.out.println("Doctor " + lastName + " works at " + hospital);
    }

    void treat(String patientName) {
        printInfo();
        System.out.println("Treats patient " + patientName);
    }
    private void getPaid() {
        System.out.println("Doctor " + lastName + " gets paid "+ salary);
    }

    //static methods can work only with static variables
    public static void study(String University) {
        //printInfo(); CE cannot make a static reference to the non-static method
        System.out.println("Doctor studied at " + University +
        " and now works at " + hospital);
    }

}
