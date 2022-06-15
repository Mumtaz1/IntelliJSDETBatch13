package com.syntax.class15;

public class VariablesDemo3 {

    static int num = 5;
    String name;

    public static void main(String[] args) {

        VariablesDemo3 v1 = new VariablesDemo3();
        v1.name = "Naveed";

        VariablesDemo3 v2 = new VariablesDemo3();
        v2.name = "Jason";

        VariablesDemo3 v3 = new VariablesDemo3();
        v3.name = "Mumtaz";

        System.out.println(v1.name); //Naveed
        System.out.println(v1.num);  //5

        v1.num = 10;
        v1.name = "Sammer";

        System.out.println(v2.name); // still Jason. Ignores line 23
        System.out.println(v2.num); //10 b/c of line 22 else it would be 5 again

    }
}
