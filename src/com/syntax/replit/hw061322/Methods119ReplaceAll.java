package com.syntax.replit.hw061322;

public class Methods119ReplaceAll {
    /*
    Write a method header with the following specs:
    Returns:
    a String
    Name:
    censorLetter
    Parameters:
    a String
    a char
    Then  complete the method by programming the
    following behavior:
    Replace all instances of given character
    with a "*" within the given String.
    See below examples.
    Examples:
    censorLetter("computer science", 'e') =>
    "comput*r sci*nc*"
    censorLetter("trick or treat", 't') =>
    "*rick or *rea*"
     */
    String censorLetter(String a, char x) {
        return a.replaceAll(String.valueOf(x), "*");
    }

    public static void main(String[] args) {
        Methods119ReplaceAll obj = new Methods119ReplaceAll();
        System.out.println(obj.censorLetter("computer science", 'e'));
        System.out.println(obj.censorLetter("trick or treat", 't'));
    }
}
