import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.Function;

class AgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {

//            if(o1.age == o2.age) {
//                return 0;
//            }
//
//            if(o1.age < o2.age){
//                return -1;
//            }else{
//                return 1;
//            }

        return o1.age - o2.age;
    }
}

class SalaryComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.salary - o2.salary;
    }
}
public class Main {

    public static void main(String[] args) {

//        //ConcurrentMOdificationException
//        ArrayList<Integer> ar = new ArrayList<Integer>();
//
//        ar.add(1);ar.add(2);ar.add(3);
//
//
//        Iterator<Integer> ir = ar.iterator();
//        while(ir.hasNext()){
//            int p = ir.next();
//            System.out.println(p);
//            ar.add(5);
//        }

        //HashSet Vs LinkedHashSet

//        HashSet<Integer> hset = new HashSet<Integer>(); //Does not maintain insertion order
//        LinkedHashSet<Integer> lhset = new LinkedHashSet<Integer>();//Maintains insertion order
//        TreeSet<Integer> tset = new TreeSet<Integer>();//Will sort by natural ordering //RBST
//        for(int i=500;i>0;i-=10){
//            hset.add(i);
//            lhset.add(i);
//            tset.add(i);
//        }
//
//        System.out.println("Hash Set : "+ hset.toString());
//        System.out.println("LinkedHashSet Set : "+ lhset.toString());
//        System.out.println("Tree Set : "+ tset.toString());
//        System.out.println("Hello World!");


        //Collections , comparable and comparator
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(4);ar.add(1);ar.add(3);

        Collections.sort(ar);
        System.out.println(ar.toString());


        ArrayList<Student> studAr = new ArrayList<Student>();
        studAr.add(new Student(10, "Akash", 50, 10));
        studAr.add(new Student(30, "Sam", 100, 5));
        studAr.add(new Student(13, "Abhay", 150, 7));
        studAr.add(new Student(25, "Sundeep", 60, 20));

//        Collections.sort(studAr, new AgeComparator());
//        Collections.sort(studAr, new SalaryComparator());
         Collections.sort(studAr);
         Collections.sort(studAr, (o1,o2) -> {
             return o1.age - o2.age;
         });

//         Collections.sort(studAr, new Comparator<Student>() {
//             @Override
//             public int compare(Student o1, Student o2) {
//                 return o1.age-o2.age;
//             }
//         })
        for(Student s : studAr){
            System.out.println(s.name);
        }
    }
}
