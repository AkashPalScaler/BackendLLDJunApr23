package IntroToOOPs;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Akash";
//        s.id = 10; // private can't be accessed outside class
        s.setId(10);
        System.out.println(s.getId());
        s.age = 45;
        s.batch = "Scaler";

        Student y = new Student();

        System.out.println(s);
    }
}
