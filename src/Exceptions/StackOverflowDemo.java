package Exceptions;

public class StackOverflowDemo {
    static void something(int a){
        something(a*a);
    }

    public static void main(String[] args) {
        something(10);
    }
}
