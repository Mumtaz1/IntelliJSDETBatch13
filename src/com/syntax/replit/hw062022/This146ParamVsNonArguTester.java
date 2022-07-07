package com.syntax.replit.hw062022;

public class This146ParamVsNonArguTester {
    public static void main(String[] args) {
        This146ParamVsNonArgu emp = new This146ParamVsNonArgu();
        System.out.println(emp.printValues());

        This146ParamVsNonArgu emp1 = new This146ParamVsNonArgu("Joe", "Smith", 12345, "01/01/1970", 35000);
        System.out.println(emp1.printValues());
    }
}

