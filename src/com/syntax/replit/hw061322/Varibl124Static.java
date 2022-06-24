package com.syntax.replit.hw061322;

public class Varibl124Static {

    /*
    Declare static variable in class level as below
    and assign its value:
    String ss = "Welcome To Syntax Technologies"
    Access variable in the main method and print
    it using three ways you learned so far.
    Hint:
    First way: By calling directly
    Second way: By using the className
    Third way: By creating the object of the class.
    Expected Output:
    Welcome To Syntax Technologies
    Welcome To Syntax Technologies
    Welcome To Syntax Technologies
     */
    static String ss;
    static void disp (){
        System.out.println("Welcome To " + ss);
    }

    public static void main(String[] args) {
        //1st way by calling it directly
        ss = "Syntax Technologies";
        disp();
        //2nd way by using className
        System.out.println("Welcome To " + Varibl124Static.ss);
        //3rd way by creating the obj of the class
        Varibl124Static obj = new Varibl124Static();
        obj.ss = "Welcome To Syntax Technologies";
        System.out.println(obj.ss);
    }
}