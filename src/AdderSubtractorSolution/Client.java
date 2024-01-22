package AdderSubtractorSolution;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException{
        Value value = new Value();
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(value, lock);
        Subtractor subtractor = new Subtractor(value, lock);


        ExecutorService es = Executors.newFixedThreadPool(200);

        Future<Void> addFuture = es.submit(adder);
        Future<Void> subFuture = es.submit(subtractor);


        addFuture.get();
        subFuture.get();


        System.out.println("Value of val : "+ value.val);
    }
}


/*
* 1.Critical section:
*  A critical section is a piece of code which deals
* with shared data or memory
*
* code 1:
*function(Value value)
{ int j , k = 0;
* * print("adadf")
* value + = i;
*
* a = value;
*
* j = k;
* }
* print("sdkbhfd");
*
* code 2:
*
* print("asdad")
* value += 1;
* print("dj")
* x = value * 2;
* some operations
* value = x;
* print("skhbadf");
*
* print("asdad")
* value += 1;
* print("dj")
* x = y * 2;
* print("skhbadf");
*
* Note: Can we avoid critical sections? NO
*
*
* 2.Race condition:
* When two threads enter a critical section at the same time
* and tries to race each other
*
*
* 3.Pre - emptiveness: (before something is over)
* Switching a thread before it's critical section is over
*
* Note: can we avoid pre-emptiveness? No
*
* */