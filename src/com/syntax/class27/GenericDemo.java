package com.syntax.class27;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {

        //This is a generic ArrayList
        ArrayList<String> names = new ArrayList<>();
        //names.add(10); error can only insert Strings

        //This is a non-generic ArrayList. It is not recommended
        ArrayList all = new ArrayList();
        all.add(10);
        all.add("Name");
        all.add(10.5);



    }
}
