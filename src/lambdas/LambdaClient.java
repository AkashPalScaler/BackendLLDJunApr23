package lambdas;

import ProducerConsumer.Consumer;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class LambdaClient {
    public static void main(String[] args) {
        //Old implementation(without lambda)
//        Runnable task = new PrintHello();
//
//        Thread t = new Thread(task);
//
//        t.start();

        //without lambda but we are instatiating interface
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World from " + Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(task1);
        t1.start();


        //Simplify
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Hello World from " + Thread.currentThread().getName());
            }
        });
        t2.start();
        //Simplify further with lambda

        Thread t3 = new Thread(() -> {
            System.out.println("Hello World from " +
                    Thread.currentThread().getName());
        });

        t3.start();




    }
}
