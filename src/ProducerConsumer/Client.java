package ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.*;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);
        Lock lock = new ReentrantLock();
        Producer producer = new Producer(store, lock);
        Consumer consumer = new Consumer(store, lock);

        ExecutorService es = Executors.newCachedThreadPool();
        for(int i=0;i<8;i++){
            es.execute(producer);
        }
        for(int i=0;i<20;i++){
            es.execute(consumer);
        }
    }
}