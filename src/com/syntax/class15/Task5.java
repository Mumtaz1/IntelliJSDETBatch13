package com.syntax.class15;

public class Task5 {

    /*
     * Create a method called createEmail().
     * Based on values of user name, lastName,
     * and email type, your method should return
     * complete email address.
     * Example:
     * createEmail (John, Snow, gmail)
     * Output:
     * johnsnow@gmail.com
     */
    String name; //instance variable
    String completeEmail(String firstName, String lastName, String emailType) {
        return firstName + lastName + "@" + emailType + ".com";

    }

    public static void main(String[] args) {
        Task5 task = new Task5();
        System.out.println(task.completeEmail("Tara", "Sitara", "gmail"));
    }

}
