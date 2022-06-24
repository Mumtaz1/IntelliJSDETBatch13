package com.syntax.replit.hw061322;

public class Varibl126Count {

    /*
    Create a variable that will hold the count
    of all instances of the Main class.
    Create 3 Objects of the class and print
    value of the count variable.
    Expected Output:
    3
     */

    public static int count;
    public Varibl126Count() {
        count ++;
    }

    public static void main(String[] args) {
        Varibl126Count vct1 = new Varibl126Count();
        Varibl126Count vct2 = new Varibl126Count();
        Varibl126Count vct3 = new Varibl126Count();
        System.out.println(Varibl126Count.count);
    }
}