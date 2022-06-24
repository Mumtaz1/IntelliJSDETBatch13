package com.syntax.reviewclass8_1;

import com.syntax.reviewclass8.Doctor;

public class Practice extends Doctor{

    Practice(String firstName, String lastName){
        super(firstName, lastName);
    }

    public static void main(String[] args) {

        Practice doc =new Practice("John", "Smith");
        doc.printInfo();
        doc.work();
        Doctor.study("Syntax");
    }
}
