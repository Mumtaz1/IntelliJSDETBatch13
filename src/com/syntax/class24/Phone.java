package com.syntax.class24;

public abstract class Phone {

    abstract void displayPictures(); //unimplemented method
    abstract void unlock();         //unimplemented method

    void sendText() {       //implemented method
        System.out.println("Use the messaging app to send the message");
    }

}
class Iphone extends Phone {
    @Override
    void displayPictures() {
        System.out.println("Use the Photos app to display the pictures");
    }
    @Override
    void unlock() {
        System.out.println(" use FaceId to unlock the phone");
    }
}
class Samsung extends Phone {

    @Override
    void displayPictures() {
        System.out.println("Use the Gallery app to display the pictures");
    }
    @Override
    void unlock() {
        System.out.println(" use Finger print sensor or face unlock to unlock your phone");
    }
}
class Tester {
    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        samsung.displayPictures();
    }
}