package com.syntax.replit.hw062622;

public class MOverLoad160 {

    /*
    Overload instance method display by
    having different types of parameters.
    Inside each method write the logic to
    print value of the parameter.
    Call all methods inside your main
    method.
    Expected Output:
    100
    Syntax Technologies
    100.09
     */

    public void disp(int c) {
        System.out.println(c);
    }

    public void disp(String c) {
        System.out.println(c);
    }

    public void disp(double c) {
        System.out.println(c);
    }

    public static void main(String[] args) {
        MOverLoad160 obj = new MOverLoad160();
        obj.disp(100);
        obj.disp("Syntax Technologies");
        obj.disp(100.09);
    }
}
