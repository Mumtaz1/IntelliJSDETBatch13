public class MethodsDemo1 {
    void method1() {
        System.out.println("I can use print statements in a void type method");
        int num = 0;
        //return "balla"; because void means no data will be returned from this mehtod
    }

    public static void main(String[] args) {
        MethodsDemo1 methodsDemo1 = new MethodsDemo1();
       // int x = methodsDemo1.method(); methods with void return type can't be assigned to variables.

    }
}
