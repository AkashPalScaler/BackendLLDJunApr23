package Inheritance;

public class C extends B {
    private int c;

    public C(){
        //Call B
        super(20);
        System.out.println("Constructor of C called!");
    }

    public C(int c){
        this.c = c;
    }
}
