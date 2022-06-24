package com.syntax.class17;

import com.syntax.class18.HW6LevelsOfConstructors;

public class HW6LevelsOfConstructorsTest2 {
    public static void main(String[] args) {

        HW6LevelsOfConstructors obj2 = new HW6LevelsOfConstructors("Welcome");
    /*
    Note we cannot run the below here because:
    - HW6LevelsOfConstructors obj1 = new HW6LevelsOfConstructors(5); it is marked private in
      class18 -> HW6LevelsOfConstructors.

    - HW6LevelsOfConstructors obj3 = new HW6LevelsOfConstructors(true); it is marked protected
      in class18 -> HW6LevelsOfConstructors.

    - HW6LevelsOfConstructors obj4 = new HW6LevelsOfConstructors(); it is marked default in
      class18  -> HW6LevelsOfConstructors and so it has to be in the same package
     */

    }
}
