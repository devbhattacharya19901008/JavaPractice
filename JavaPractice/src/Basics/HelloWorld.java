package Basics;

public class HelloWorld {
    // class variable.
    static String hi;
    // instance variable.
    int age = 0;

    public HelloWorld(String name, int age){
        this.age = age;
        hi = "Hello " + name + " and I am " + age + " years old";
    }
    public static void main(String args[]){
        HelloWorld helloWorld = new HelloWorld("Dev", 30);
        System.out.println(helloWorld.age);
        System.out.println(helloWorld.hi);
    }

}
