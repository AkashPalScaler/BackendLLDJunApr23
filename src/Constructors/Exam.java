package Constructors;

public class Exam {
    int exam_id;
    String name;

    Exam(){
        exam_id = 0;
        name = "Akash";
    }

    Exam(Exam other){
        this.exam_id = other.exam_id;
        this.name = other.name;
    }
}
