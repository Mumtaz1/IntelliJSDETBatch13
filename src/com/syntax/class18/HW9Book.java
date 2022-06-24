package com.syntax.class18;

public class HW9Book {

    /*
    Write Book class that will have instance variables
    and 2 Constructors. While creating an object make
    sure: instance variables are being initialized.
    Both Constructors are being executed.
     */
    public String title;
    public String author;

    public HW9Book(String title1, String author1) { //constructor that initializes variables
        title = title1;
        author = author1;

    }

    public static void main(String[] args) {
        HW9Book book = new HW9Book("Learning Java", "Arthur Doe"); //constructor is invoked
        //while creating an object of the HW9Book class.
        System.out.println(book.title + " by " + book.author); //Print title and author
    }

}


