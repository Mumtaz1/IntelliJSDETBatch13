package com.syntax.replit.hw062022;

public class AccessMod138AnotherClass {

    /*
    In AnotherClass declare a private, default,
    protected, public methods and have them
    each return the name of the access
    modifier they are using.
    All methods should be accessible by
    class name.
    Call methods of Another class inside
    Main class.
    Expected Output:
    default
    protected
    public
     */

    private String priv = "Welcome to Syntax";
    String def = "default";
    protected String pro = "protected";
    public String pub = "public";
}
    class Main {
        public static void main(String[] args) {
        AccessMod138AnotherClass anotherclass = new AccessMod138AnotherClass();
            System.out.println(anotherclass.def);
            System.out.println(anotherclass.pro);
            System.out.println(anotherclass.pub);
    }
}
