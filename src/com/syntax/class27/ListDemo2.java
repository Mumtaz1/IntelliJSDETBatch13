package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> legends = new ArrayList<>(); //recommended
        legends.add("Hamid");
        legends.add("Karla");
        legends.add("Naveed");
        legends.add("Tara");
        legends.add("Yusuf");
        ArrayList<String> moreStudents = new ArrayList<>();
        moreStudents.add("Jason");
        moreStudents.add("Handan");

        ArrayList<String> allStudents = new ArrayList<>();
        allStudents.addAll(legends); //if below line is commented out Hamid, Karla, Naveed, Tara, Yusuf
        allStudents.addAll(moreStudents); //adds Jason and Handan to the output.
        System.out.println(allStudents);
        allStudents.removeAll(legends); //opposite to addAll method. It removes from the first array.
                //so prints Jason, Handan only
        System.out.println(allStudents);
        allStudents.clear(); //will see an empty arrayList.

        System.out.println(allStudents);
    }
}
