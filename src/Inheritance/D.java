package Inheritance;

public class D extends C {
    int d;

    public D(){
        //Calls C()
        super(10);
        System.out.println("Constructor of D called!");

    }
}
