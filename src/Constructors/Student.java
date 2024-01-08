package Constructors;

public class Student {
    String name;
    int age;
    float psp;
    String batch;
    Exam sql_exam;

    Student(){
        age = 2;
        name="Some default";
        sql_exam = new Exam();
    }

    Student(int age){
        this.age = age;
    }

    Student(String name, int age, String batch){
        this.name = name;
        this.age = age;
        this.batch = batch;
    }

    Student(String name, int age, String batch,Exam e){
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.sql_exam = e;
    }
    //Copy constructor
    Student(Student other){
        this.psp = other.psp;
        this.name = other.name;
        this.age = other.age;
        this.batch = other.batch;
//        this.sql_exam = other.sql_exam; //Memory getting copied, shallow copy
        this.sql_exam = new Exam(other.sql_exam);
    }
}
