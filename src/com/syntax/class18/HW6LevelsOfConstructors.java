package com.syntax.class18;

public class HW6LevelsOfConstructors {

    /*
    Write a Java class that has 4 constructors
    with 4 different access levels of
    constructors (private, public, default,
    protected) and create 4 objects of this
    class:
    1 - inside same class
    2 - from outside the class
    3 - from different class inside
        different package and observe
        result.
     */
    private HW6LevelsOfConstructors() {
        System.out.println("Access level for this constructor is Private");
    }
    public HW6LevelsOfConstructors(String pub) {
        System.out.println(pub+ "Access level for this constructor is Public");
    }
    HW6LevelsOfConstructors(int d) {

        System.out.println(d+ "Access level for this constructor is default");
    }
    protected HW6LevelsOfConstructors(boolean boo) {
        System.out.println(boo+ "Access level for this constructor is Private");
    }

    public static void main(String[] args) {
        HW6LevelsOfConstructors obj1 = new HW6LevelsOfConstructors();
        HW6LevelsOfConstructors obj2 = new HW6LevelsOfConstructors("Welcome");
        HW6LevelsOfConstructors obj3 = new HW6LevelsOfConstructors(5);
        HW6LevelsOfConstructors obj4 = new HW6LevelsOfConstructors(true);
    }
}
