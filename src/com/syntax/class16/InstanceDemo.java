package com.syntax.class16;

public class InstanceDemo {

    String str = "instance";

    void changeInstanceValue() {
        str = "method1";
    }

    void printInstanceValue() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        InstanceDemo id = new InstanceDemo();
        System.out.println(id.str); //prints the value of str which is instance
        id.printInstanceValue(); //method once simply prints the value of str which is still instance
        id.changeInstanceValue(); //this method changes the instance variable which will not be Captain Marvel
        id.printInstanceValue(); // method once simply prints the value of str which is now instance Captain Marvel

    }
}
