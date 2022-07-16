package com.syntax.replit.hw070222;
abstract class Abstract173SuperTea {

    /*
    Abstraction:
    Create a Super class Tea that will have:
    - instance variable teaType:
    - constructor that will initialize
    - unimplemented method addSugar(),
    Create 2 subclasses of Tea as Lemon Tea and Chai Tea.
    In main class create an object of 2 Child and assign them
    to Parent reference type.
    Execute method addSugar from both classes.
    Expected Output:
    For Lemon tea we need 2 spoons of sugar
    For Chai Tea we need 1 spoon of sugar.
     */
        abstract void addSugar();

        String teaType;
    Abstract173SuperTea(String teaType)  {
            this.teaType = teaType;
        }
    }
    class LemonTea extends Abstract173SuperTea {
        LemonTea(String teaType) {
            super(teaType);
        }
        @Override
        void addSugar() {
            System.out.println("For Lemon Tea we need 2 spoons of sugar");
        }
    }
    class ChaiTea extends Abstract173SuperTea {
        ChaiTea(String teaType) {
            super(teaType);
        }
        @Override
        void addSugar() {
            System.out.println("For Chai Tea we need 1 spoon of sugar");

        }
    }
    class Main {
        public static void main(String[] args) {
            LemonTea lemon = new LemonTea("Lemon Tea");
            lemon.addSugar();
            ChaiTea chai = new ChaiTea("Chai Tea");
            chai.addSugar();
        }
    }