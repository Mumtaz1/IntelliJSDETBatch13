package com.syntax.class21;

public class Programming {
    /*
    Create a class named 'Programming'. While
    creating an object of the class, if nothing
    is passed to it, then the message "I love
    programming languages" should be printed.
    If some String is passed to it, then in
    place of "programming languages" the value
    variables should be printed.
    Example, if we pass "Java", then "I love
    Java" should be printed.
     */

  //This is HW2
    void language() {
        System.out.println("I love programming ");
    }
    void language(String language) {
        System.out.println("I love Java");
    }

    public static void main(String[] args) {
        Programming program = new Programming();
        program.language();
        program.language("Java");
    }
}
