package com.syntax.class19;

import com.syntax.class20.Laptop;

public class Appletop extends Laptop {
    void printMake() {
        //Can't access because we are in a different package if its default
        //but can access if it's protected.
        System.out.println(make);
    }
}