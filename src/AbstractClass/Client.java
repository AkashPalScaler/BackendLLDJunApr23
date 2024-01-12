package AbstractClass;

public class Client {
    public static void main(String[] args) {
//        Animal a = new Dog();
//        Dog d = new Dog();
//
//        d.chasingCars();
//        a.move();
//        d.move();

        Animal a = new BullDog();
        a.printName();
    }
}
