package com.syntax.replit.hw062022;

public class Construct142 {
     /*
       1. Complete the Syntax Technologies class:
          Include the following class variables:
          - schoolName(String)
          batch(int)
          year(int)
          lastDayOfClass(String)

          Write two constructors:
          - non-argument constructor
          - parameterized constructor
          Create a method to display values of
          instance variables.
       2. In Main Class:
          Create two different objects of the
          SyntaxTechnologies class using both
          constructors and call display method.
          Expected Output:
          null 0 0 null
          Syntax 6 2020 07/30/2020
      */

    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    //Non-argument Constructor:
    Construct142() {

    }

    //Parameterized Constructor:
    Construct142(String schoolName, int batch, int year, String lastDayOfClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;
    }

    String displayInfo() {

        return schoolName + " " + batch + " " + year + " " + lastDayOfClass;
    }
        public static void main(String[] args) {

            Construct142 obj1 = new Construct142();
            System.out.println(obj1.displayInfo());

            Construct142 obj2 = new Construct142("Syntax", 6, 2020, "07/30/2020");
            System.out.println(obj2.displayInfo());
        }
    }