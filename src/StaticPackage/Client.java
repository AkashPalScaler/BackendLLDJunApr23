package StaticPackage;

import java.sql.BatchUpdateException;

public class Client {
    public static void main(String[] args) {
//        System.out.println(Dog.age);
//        Dog.doSomething();
//
//        Dog.age = 10;
//
//
//        //CHILD CLASS INHERIT STATIC METHODS FROM PARENT
//        BullDog.doSomething();
//        System.out.println(BullDog.age);


        BullDog bd = new BullDog();

        bd.doSomething();

        Dog d = new BullDog();

        d.doSomething(); //In case of non static overriding, "something of bulldog" would get printed
        //But here "something in Dog" will get printed(Because static methods are tied to class)


        d.print();

    }
}
