package com.syntax.replit.hw070222;

class  OutputInterface177 implements Functions {

    /*
    Follow steps carefully
    Step1: Create Interface as Outputs
    Step2: Create one method with below display, parameters --> result (choose the datatype as required).
    Step3: Create Interface as Functions
    Step4: Inherit to Outputs
    Step5: Create 4 methods as below.
    - return type double, method label adding,
      parameters --> firstNumber, SecondNumber
      (choose the datatype as required).
    - return type double, method label subtracting,
      parameters --> firstNumber, SecondNumber
      (choose the data as required).
    - return type double, method label dividing,
      parameters --> firstNumber, SecondNumber
      (choose the datatype as required.
    Step6: In main class inherit to Functions Interface.
    Step7: Provide implementation logic to unimplemented methods.
    Step8: Complete the body of all the methods as below:
    - Display method to print the result parameter as
      shown below in Outputs.
    - Adding, Subtracting, Multiplying, Dividing each
      will have the logics to do simple mathematic
      operation and return the result.
    Step9: Create the main method inside the main method declare the below variables.
    - double firstNumber = 100.00;
    - double secondNumber = 20.00;
    Step10: Instantiate the object of Main class and call the  methods one by one to print the result and sequence shown below.
    Expected Output:
    Result is ::: 120.0
    */

    public void display(double result){
        System.out.println("Result is ::: "+result);
    }
    public double adding(double firstNumber, double secondNumber){
        return firstNumber+secondNumber;
    }
    public double subtracting(double firstNumber, double secondNumber){
        return firstNumber-secondNumber;
    }
    public double multiply(double firstNumber, double secondNumber){
        return firstNumber*secondNumber;
    }
    public double dividing(double firstNumber, double secondNumber){
        return firstNumber/secondNumber;
    }
    public static void main(String[] args){
        double firstNumber = 100.00;
        double secondNumber = 20.00;
        OutputInterface177 obj = new OutputInterface177();
        double result = obj.adding(firstNumber, secondNumber);
        obj.display(result);
        result = obj.subtracting(firstNumber, secondNumber);
        obj.display(result);
        result = obj.multiply(firstNumber, secondNumber);
        obj.display(result);
        result = obj.dividing(firstNumber, secondNumber);
        obj.display(result);
    }
}
interface Outputs{
    void display(double result);
}
interface Functions extends Outputs{
    double adding(double firstNumber, double secondNumber);
    double subtracting(double firstNumber, double secondNumber);
    double multiply(double firstNumber, double secondNumber);
    double dividing(double firstNumber, double secondNumber);
}