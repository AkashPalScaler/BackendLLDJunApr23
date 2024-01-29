package ProducerConsumerSemaphores;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable{
    Store store;
    Semaphore prodSema;
    Semaphore consSema;
    public Consumer(Store store, Semaphore prodSema, Semaphore consSema){
        this.store = store;
        this.prodSema = prodSema;
        this.consSema = consSema;
    }
    public void run(){
        while(true){
            try{
                consSema.acquire();
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            //if(currentSize > 0) -> item available or not?
            store.removeItem();
            prodSema.release();
        }
    }
}