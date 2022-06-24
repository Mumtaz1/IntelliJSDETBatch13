package com.syntax.replit.hw061322;

public class Methods118Spaces {

    /*
    Write a method header on line two with the
    following specs:
    Returns:
    a String
    Name:
    spaceOut
    Parameters:
    a String
    Then complete the method by programming the
    following behavior:
    Insert spaces after every character in the
    String s, then return the new string.
    See below examples (Note the space at the
    end as well).
    Examples:
    spaceOut("hello" ==> " h e l l o "
    spaceOut("technology") ==> "t e c h n o l o g y"
     */
    public static String spaceOut(String s) {
        return s.replaceAll("", " ");
    }

    public static void main(String[] args) {
        Methods118Spaces print = new Methods118Spaces();
        System.out.println(print.spaceOut("hello")); // " h e l l o"
        System.out.println(print.spaceOut("technology")); //"t e c h n o l o g y"
    }
}
