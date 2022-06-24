package com.syntax.class20;

import java.util.Arrays;

// This code is not quite right. It is still printing [20, 40, 50, 30, 0, 0, 0, 0]

public class CountDuplicate2 {
    public static void main(String[] args) {
        int [] arr={20,20,40,50,30,30,30,30};
        countDuplicates(arr);
    }

    static void countDuplicates(int [] arr){
        int [] arr2=new int[arr.length];
        int counter=0;
        for (int j : arr) {
            if (!isPresent(j, arr2)) {
                arr2[counter++] = j;
            }
        }

        System.out.println(Arrays.toString(arr2));
    }
    static boolean isPresent(int element,int [] arr){

        for(int e:arr){
            if(element==e){
                return true;
            }
        }
        return false;
    }
}