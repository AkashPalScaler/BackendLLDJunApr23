package StaticPackage;


public class BullDog extends Dog {

    static int age;

    //can't override static method with non static
    //

    static void doSomething(){
        System.out.println("Something in bulldog");
    }
    //print Inherited from DOG
    @Override
    void print(){
        System.out.println("BUlldog print");
    }
}
