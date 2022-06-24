package com.syntax.replit.hw061322;

public class Static132Subtract {

    /*
    Complete the reduce10 method by making it
    subtract 10 from any element of the double
    array nums.
    The method should be static, and it should
    return a new 2D array object.
    Print values from new array in the format
    below input:
    1 2 3 4
    4 5 6 7
    1 3 5 7
    Expected Output:
    -9 -8 -7 -6
    -6 -5 -4 -3
    -9 -7 -5 -3
     */


    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };
        reduce10(a);

    }
    //create method reduce10 here
    static int[][] reduce10(int[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print((a[i][j]-10)+" ");
            }
            System.out.println();
        }
        return a;
    }
}
