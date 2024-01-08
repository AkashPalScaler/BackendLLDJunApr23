package Inheritance;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.user_id = 10;
        s.setAge(20);
        System.out.println("AGe : " + s.getAge());
        System.out.println("Debug");
    }
}
