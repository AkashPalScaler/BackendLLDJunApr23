package IntroToThreads;

public class Client {
    public static void main(String[] args) {
//        System.out.println("Thread inside main : " + Thread.currentThread().getName());

//        HelloWorldPrinter hwpTask = new HelloWorldPrinter();

        Thread t = new Thread(new HelloWorldPrinter()); //Creation of thread
        t.start(); //Starting to execute run method
    }
}
//Thread class
//public Thread(Runnable target){


