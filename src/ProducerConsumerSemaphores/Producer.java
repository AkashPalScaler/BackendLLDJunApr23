package ProducerConsumerSemaphores;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable{
    Store store;
    Semaphore prodSema;
    Semaphore consSema;
    public Producer(Store store, Semaphore prodSema, Semaphore consSema){
        this.store = store;
        this.prodSema = prodSema;
        this.consSema = consSema;
    }


    public void run(){
        while(true){
                //if(currentSize < MaxSize)
            try{
                prodSema.acquire();
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            store.addItem();
            consSema.release();
        }
    }
}