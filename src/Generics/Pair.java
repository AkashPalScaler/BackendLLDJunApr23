package Generics;

import java.util.ArrayList;
import java.util.List;

public class Pair <T, V, E> {
    T a;
    V b;

    //Any static method I use here, what can It do?
    // print something inside the scope of static
    static void printPi(){
        final double pi = 3.14;
        System.out.println("Vlaue of pi " + pi);
    }
    //It can take some known value and do whatever it wants with it
    static double findCircleArea(Integer radius){
        final double pi = 3.14;
        return pi * radius * radius;
    }
    //It can take some value of varying datatype and it can print it
    static <E> void printRadius(E radius){
        System.out.println("Radius given : " + radius);
    }
    //It can take some value of varying datatype and it can return some known datatype
    static <E> List<E> findCircleAreaOfGeneric(E radius){
        List<E> list = new ArrayList<E>();
        list.add(radius);
        return list;
    }

    static <E extends Number> float findSquareArea(E radius){
        return radius.floatValue() * radius.floatValue();
    }



    public Pair(T a, V b){
        this.a = a;
        this.b = b;
    }

    void setA(T a){
        this.a = a;
    }

    T getA(){
        return a;
    }
}
