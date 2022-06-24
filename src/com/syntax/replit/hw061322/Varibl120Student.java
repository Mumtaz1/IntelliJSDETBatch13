package com.syntax.replit.hw061322;

public class Varibl120Student {

    /*
    Declare 3 instance variables to hold:
    year, school name, and batch #
    Access variables from the main method and
    assign specific values to them. Print
    values of your variables in the
    following format:
    Expected Output:
    I am a student of batch 9 studying at
    Syntax in the year of 2021.
     */

    int year;
    String school;
    int batch;

    public Varibl120Student(int year1, String school1, int batch1) {
        year = year1;
        school = school1;
        batch = batch1;
    }

    public static void main(String[] args) {
        Varibl120Student student = new Varibl120Student(2021, "Syntax", 9);
        System.out.println("I am a student of batch " +student.batch+ " studying at " +student.school+ " in the year of " + student.year );
    }
}
