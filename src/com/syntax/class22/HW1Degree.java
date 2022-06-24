package com.syntax.class22;

public class HW1Degree {

        /*
        Create a class 'Degree' having a method 'getPrerequisite' that
        prints ""To get a degree you need high school diploma"".
        - Class 'Degree' has 2 subclasses namely 'Bachelors' and 'Masters'.
          In Masters class override method 'getPrerequiste'.
        - Call the method by creating an object of each of the three classes.
         */

            void getPrerequisite() {
                System.out.println("To get a degree you need a high school diploma");
            }
        }
            class Bachelors extends HW1Degree {
            }

        class Masters extends Bachelors{
            @Override
            void getPrerequisite() {
                System.out.println("To get a Master's degree you need a Bachelor degree");
            }

            public static void main(String[] args) {
                Bachelors bachelor = new Bachelors();
                bachelor.getPrerequisite();

                Masters master = new Masters();
                master.getPrerequisite();
            }
        }
