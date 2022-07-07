package com.syntax.replit.hw062622;

public class Final169 {

    /*
    Create final method avgElements that will
    average all the elements in an integer
    array (passed to the method as a
    parameter) and return the average.
    Expected Output:
    4.8
     */


    // these lines were already written for us.
    public static void main(String[] args) {
        int[] a = {2, 7, 3, 8, 4};
        System.out.println(avgElements(a)); //should print 4.8
    }
    final static double avgElements(int[] num) {
            double avg = 0;
            double sum = 0;
            for (int i = 0; i < num.length; i++) {
                sum += num[i];
                avg = sum / num.length;
            }
            return avg;
        }
    }