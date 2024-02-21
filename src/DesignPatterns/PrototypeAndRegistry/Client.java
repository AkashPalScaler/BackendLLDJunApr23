package DesignPatterns.PrototypeAndRegistry;

public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry){
        Student AprBatchStudent = new Student(97, "AprBeg2021");
        Student JunBatchStudent = new Student(95, "JunBeg2023");
        studentRegistry.register("April", AprBatchStudent);
        studentRegistry.register("June", JunBatchStudent);

        IntelligentStudent AprBatchIntelStudent = new IntelligentStudent(97, "AprInt2022", 120);

        studentRegistry.register("AprilIntelligent", AprBatchIntelStudent);

    }
    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student anadi = studentRegistry.
                get("April").clone();
        anadi.setName("Anadi");

        Student vivek = studentRegistry.
                get("April").clone();
        vivek.setName("Vivek");

        Student hari = studentRegistry.
                get("June").clone();
        hari.setName("Hari");

        Student vijay = studentRegistry.
                get("June").clone();
        vijay.setName("Vijay");

        IntelligentStudent sandeep = (IntelligentStudent) studentRegistry
                .get("AprilIntelligent").clone();
        sandeep.setName("Sandeep");
        sandeep.setIq(130);

        Student srikanth = studentRegistry
                .get("AprilIntelligent").clone();

        System.out.println("hello");

    }
}
