import java.util.Comparator;

public class Student implements Comparable<Student> {
    int age;
    String name;
    int salary;
    int psp;

    public Student(int age, String name, int salary, int psp){
        this.age = age;
        this.name= name;
        this.salary = salary;
        this.psp = psp;
    }

    @Override
    public int compareTo(Student o) {
        return this.psp - o.psp;
    }
}
