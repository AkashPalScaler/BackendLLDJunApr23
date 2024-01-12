package AbstractClass;

public abstract class Animal {
    String name;
    int age;

    public void printName(){
        System.out.println(name);
    }

    public abstract void move();
}
