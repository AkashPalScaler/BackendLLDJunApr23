package Inheritance;

public class B extends A {
    int b;

    public B(){
        //Call A
        System.out.println("Constructor of B called!");
    }

    public B(int b){
        this.b = b;
    }
}
