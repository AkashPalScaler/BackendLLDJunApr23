package Polymorphism;

public class Student extends User{
    int age;

//
//    void a(Object a){
//        System.out.println("Object");
//    }
//
//    void a(String a){
//        System.out.println("String");
//    }

    //Override
    static void print(){
        System.out.println("Hello Student");
    }

    //Overloading examples
    static void print(int a){
        System.out.println("hello "+ a);
    }
    static void print(String b, int a){
        System.out.println("hello "+ a);
    }
    static void print(int a, String d){
        System.out.println("hello "+ a);
    }

    void doSomething(int a){
        age = 10;
        System.out.println("j");
    }

    int doSomething(String a){
        System.out.println("j");
        return 0;
    }
}
