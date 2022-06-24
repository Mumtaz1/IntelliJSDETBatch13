package com.syntax.replit.hw061322;

public class Methods113Param2Int {

    /*
    Step1. Create a method that will accept 2
           parameters of integer type.
    Step2: Write the logic in that method in
           println statement to print hours
           and minutes.
    Step3: Call the method.
    Expected Output:
    11:30
     */
    int hour = 11;
    int mins = 30;

    void printTime() {
        System.out.println(hour + ":" + mins);
    }

    public static void main(String[] args) {
        Methods113Param2Int time = new Methods113Param2Int();
        time.printTime();
    }
}
