package com.syntax.class21;

public class HW4PrivateOverLoading {

    /*
    Create 1 class with a private method that
    has 3 overloaded forms. Then call each
    overloaded method with specific
    arguments and observe result.
     */
    private void vegetables(String name) {
        System.out.println("Student's name is: "+name);
    }
    private void vegetables(String name, int age) {
        System.out.println("Student's name is: " +name+ " she is " +age+ " years old");
    }
    private void vegetables(String name, String subject, int age) {
        System.out.println("Student's name is: " +name+ " and he is taking "
                +subject+ " and he is " +age+ " years old");
    }

    public static void main(String[] args) {
        HW4PrivateOverLoading overload = new HW4PrivateOverLoading();
        overload.vegetables("Mary");
        overload.vegetables("Cindy", 21);
        overload.vegetables("John", "Java",25);
    }
}