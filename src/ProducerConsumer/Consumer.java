package ProducerConsumer;
import java.util.concurrent.locks.*;
public class Consumer implements Runnable{
    Store store;
    Lock lock;
    public Consumer(Store store, Lock lock){
        this.store = store;
        this.lock = lock;
    }
    public void run(){
        while(true){
                lock.lock();
                //if(currentSize > 0) -> item available or not?
                if(store.getItems().size() > 0){
                    store.removeItem();
                }
                lock.unlock();
        }
    }
}