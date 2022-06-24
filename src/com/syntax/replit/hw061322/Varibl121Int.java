package com.syntax.replit.hw061322;

public class Varibl121Int {

    /*
    Declare 3 instance variables to hold an
    integer, double and char values. Create
    2 instances of the class and assign
    values to variables and then print them.
    Expected Output:
    10
    10.23
    a
    100
    100.23
    s
     */

    int num;
    double numnum;
    char n;

    public Varibl121Int(int num1, double numnum1, char n1) {
        num = num1;
        numnum = numnum1;
        n = n1;
    }

    public static void main(String[] args) {
        Varibl121Int value1 = new Varibl121Int(10, 10.23, 'a');
        System.out.println(value1.num);
        System.out.println(value1.numnum);
        System.out.println(value1.n);

        Varibl121Int value2 = new Varibl121Int(100, 100.23, 's');
        System.out.println(value2.num);
        System.out.println(value2.numnum);
        System.out.println(value2.n);
    }
}
