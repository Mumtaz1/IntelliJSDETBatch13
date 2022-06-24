package com.syntax.class18;

public class ThisKeywordDemo {

    String name = "instance";
    void printName() {
        String name = "local";
        System.out.println(name);  //local
        System.out.println(this.name); //instance
    }

    public static void main(String[] args) {
        ThisKeywordDemo t = new ThisKeywordDemo();
        t.printName();  // local because local variable is preferred over instance variable
        //but if you change line 8 to this.name then you will get instance as output
    }
}
