package ProducerConsumer;
import java.util.concurrent.locks.*;

public class Producer implements Runnable{
    Store store;
    Lock lock;
    public Producer(Store store, Lock lock){
        this.store = store;
        this.lock = lock;
    }


    public void run(){
        while(true){
                //if(currentSize < MaxSize)
                lock.lock();
                if(store.getItems().size() < store.getMaxSize()){
                    store.addItem();
                }
                lock.unlock();
        }
    }
}