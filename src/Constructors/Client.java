package Constructors;

public class Client {
    public static void main(String[] args) {
//        Student s = new Student(10);
//        Student s2 = new Student("Akash", 20, "Apr23");
//        Student s3 = new Student();


        Exam e = new Exam();

        Student s = new Student("Akash", 20, "Apr23", e);

        Student s1 = new Student(s);

//        Student s2 = s; // Points to same memory

        s1.sql_exam.exam_id = 10;
        s1.name = "Parth";

        System.out.println("Debug");
    }
}
