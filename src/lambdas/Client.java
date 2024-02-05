package lambdas;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Client {
    public static void main(String[] args) {
//        DemoImplementation demoOb = new DemoImplementation();
//        demoOb.fun();

        DemoFuncInterface dIntf = new DemoFuncInterface() {
            @Override
            public void fun(){
                System.out.println("Called from Anonymous function/ Inline class");
            }
        };

        DemoFuncInterface dIntf2 = new DemoFuncInterface() {
            @Override
            public void fun() {
                System.out.println("Different impl, called from anonymous");
            }

            @Override
            public void fun2(){
                System.out.println("Overriding the default method");
            }
        };

        dIntf.fun();
        dIntf.fun2();

        Consumer<Integer> PrintInteger = new Consumer<Integer>(){
            @Override
            public void accept(Integer a) {
                System.out.println("I am integer :" + a);
            }
        };

        PrintInteger.accept(10);

        Predicate<Integer> checkEven = new Predicate<Integer>() {
            @Override
            public boolean test(Integer a) {
                return a%2 == 0;
            }
        };

        System.out.println(checkEven.test(10));
        System.out.println(checkEven.test(11));



    }
}
