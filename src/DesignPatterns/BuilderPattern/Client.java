package DesignPatterns.BuilderPattern;

public class Client {

    public static void main(String[] args) {

        try {


            //Solution 1
//            Builder b = new Builder();
//            b.setName("Akash");
//            b.setAge(20);
//            Student s = new Student(b);

            //Solution 2
//            Builder b = Student.getBuilder()
//                    .setAge(20)
//                    .setName("Akash")
//                    .setGradYear(2020)
//                    .setPsp(1)
//                    .setUnivName("SRM");
//            Student s = new Student(b);
//
            //Solution 3
//            Student s = new Student(Student.getBuilder()
//                    .setAge(20)
//                    .setName("Akash")
//                    .setGradYear(2020)
//                    .setPsp(1)
//                    .setUnivName("SRM"));

            //Solution 4
            Student s = Student.getBuilder()
                    .setAge(20)
                    .setName("Akash")
                    .setGradYear(2020)
                    .setPsp(1)
                    .setUnivName("SRM")
                    .build();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
