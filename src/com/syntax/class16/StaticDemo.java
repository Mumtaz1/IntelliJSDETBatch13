package com.syntax.class16;

public class StaticDemo {

    static int noOfEmployees = 10;
    String name;

    static void method1() {
        System.out.println(noOfEmployees);
    //    System.out.println(name); //get non-static variable name cannot be referenced from a static context.
        //Because each object will be having a separate copy of this name variable Java gets confused
        // like Abdul Samad which value to print.
    }

    void method2() {
        System.out.println(noOfEmployees);
        System.out.println(name);
    }

    public static void main(String[] args) {
        StaticDemo st = new StaticDemo();
        st.name = "Omid";

        StaticDemo st2 = new StaticDemo();
        st2.name = "Rachid";


    }
}
