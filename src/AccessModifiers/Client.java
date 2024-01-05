package AccessModifiers;

import IntroToOOPs.Student;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Akash";
//        s.id = 10; // private can't be accessed outside class
//        s.age = 45;
        Student y = new Student();

        System.out.println(s);
    }
}
