package com.syntax.replit.hw062022;

public class AccessMod139LetterLater {

    /*
    Create a method that will be available to
    all classes in your project with the
    following specifications:
    Returns:
    a String
    Name:
    alphabetical
    Parameters:
    a String called str
    Purpose:
    Return a string that is composed of each
    letter as long as the letter is later on
    in the alphabet than its previous one.
    You can assume actual parameters
    are lowercase. See below example.
    Additional Info:
    You can use < and > to compare characters
    (not Strings), where characters later on
    in the alphabet are "greater".
    Examples:
    'a' < 'b' ==> True
    'a' < 'a' == False
    'a' > 'b' ==> False
    Examples:
    alphabetical("hello") ==> 'hlo'

     */

    public static void main(String[] args) {
        System.out.println(alphabetical("hello")); //"hlo"
        System.out.println(alphabetical("software")); //"stwr"
        System.out.println(alphabetical("language"));//"lnug"
    }
    public static String alphabetical(String str) {
        String nString = "";
        int value;
        for (int i = 0; i < str.length() - 1; i++) {
            value = Math.max((int) str.charAt(i), (int) str.charAt(i + 1));
            nString += (char) value;
            if (i < str.length() - 3)
                i++;
        }
        return nString;
    }
}
