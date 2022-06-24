package com.syntax.replit.hw061322;

public class Static131Every3Ltr {

    /*
    Write a method header on line two with the
    following specs:
    Returns:
    a String
    Name:
    thirdLetter
    Parameters:
    a String called s
    Then complete the method by programming the
    following behavior:
    Returns every 3rd letter of the String s,
    starting from the first letter.
    See below examples.
    Examples:
    thirdLetter("hello there") ==> "hltr"
    thirdLetter("technology") ==> "thly"
     */
    static String thirdLetter(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i+=3){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}