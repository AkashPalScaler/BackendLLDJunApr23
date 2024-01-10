public class Student {
    int age;
    static int count;

    //non static - after object creation
    public void print(){
        System.out.println(count);
    }

    static void printSomething(){
        System.out.println(count);
    }

}
