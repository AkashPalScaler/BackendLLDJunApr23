package IntroToThreads;

public class HelloWorldPrinter implements Runnable {

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " - Hello World");
        doSomething();
    }

    public void doSomething(){
        System.out.println(Thread.currentThread().getName() + " - Do something");
    }
}
