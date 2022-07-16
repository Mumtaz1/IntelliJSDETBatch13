package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {

    public static void main(String[] args) {
     //   ArrayList<ArrayList<String>> nameInsideAnothername = new ArrayList<>();
        ArrayList<String> legends = new ArrayList<>(); //recommended
        legends.add("Hamid");  //0
        legends.add("Karla");  //1
        legends.add("Naveed"); //2
        legends.add("Tara");   //3
        legends.add("Yusuf");
        legends.add("Yusuf");
        legends.add("Herbert");
        legends.add("Yusuf");
        System.out.println(legends.get(4)); //Yusuf
        System.out.println(legends.get(2)); //Naveed
        System.out.println(legends);

        legends.set(0, "Hamid Jan"); //replaces an index
        System.out.println(legends);
        System.out.println(legends.indexOf("Yusuf")); //4
        System.out.println(legends.lastIndexOf("Yusuf")); // 7

        System.out.println(legends.subList(0, 3)); //3 i.e., 0-3, which is Hamid Jan, Karla, Naveed

    }
}