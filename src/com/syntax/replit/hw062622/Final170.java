package com.syntax.replit.hw062622;

public class Final170 {

    /*
    Overload 2 final instance methods:
    Call them in main method
    Expected Output:
    Final method with boolean parameter
    Final method with String parameter
     */
    String instanceMeth1 = "Final method with boolean parameter";
    String instanceMeth2 = "Final method with String parameter";

    public final void overLoad(String instanceMeth1, String instanceMeth2) {
        this.instanceMeth1 = instanceMeth1;
        this.instanceMeth2 = instanceMeth2;
    }

    public static void main(String[] args) {
        Final170 obj = new Final170();
        System.out.println(obj.instanceMeth1);
        System.out.println(obj.instanceMeth2);
    }
}
