package com.syntax.replit.hw062022;

public class AccessMod136 {

    /*
    Please create methods with different access
    modifiers (one for each access modifier) and
    call them properly in main method one by one.
    In each method write the logic accordingly
    like for private method write the logic in
    the println statement as "This is Private
    Method" accordingly for rest of the methods
    that have different access modifiers.
    There should be a total of 4 outputs, please
    make sure they are in the same order that
    is printed below.
    Expected Output:
    This is Private Method
    This is Default Method
    This is Protected Method
    This is Public Method
     */

    private void priMeth() {
        System.out.println("This is Private Method");
    }
    void defMeth() {
        System.out.println("This is Default Method");
    }
    protected void proMeth() {
        System.out.println("This is Protected Method");
    }
    public void pubMeth() {
        System.out.println("This is Public Method");
    }

    public static void main(String[] args) {
        AccessMod136 obj1 = new AccessMod136();
        obj1.priMeth();
        obj1.defMeth();
        obj1.proMeth();
        obj1.pubMeth();
    }
}