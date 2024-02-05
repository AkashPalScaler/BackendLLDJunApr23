package lambdas;

@FunctionalInterface
public interface DemoFuncInterface {
    void fun(); //SAM

    default void fun2(){
        System.out.println("I am a default method");
    }

    static void fun3(){
        System.out.println("I am a static method");
    }
}
