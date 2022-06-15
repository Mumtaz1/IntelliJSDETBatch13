package com.syntax.class16;

public class Students {

    /*
    Create a Class called Students.
    - Create three variables Name, ID, and numberOfStudents.
    - Create three objects of the Students Class.
    - Set the value for studentName, studentID and increment the
      numberOfStudents for each object.
    - Print out total number of students.
     */
    String name;
    int id;
    static int numberOfStudents;

    public static void main(String[] args) {

        Students student1 = new Students();
        student1.name = "Mumtaz";
        student1.id = 100;
        numberOfStudents ++;

        Students student2 = new Students();
        student2.name = "Cindy";
        student2.id = 101;
        numberOfStudents ++;

        Students student3 = new Students();
        student3.name = "Sergio";
        student3.id = 100;
        numberOfStudents ++;

        System.out.println("The number of students is " + numberOfStudents);

    }
}
