package ProducerConsumerSemaphores;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    private int maxSize;
    private ConcurrentLinkedQueue<Object> items;

    public int getMaxSize(){
        return maxSize;
    }

    public ConcurrentLinkedQueue<Object> getItems(){
        return items;
    }

    public Store(int size){
        maxSize = size;
        items = new ConcurrentLinkedQueue<Object>();
    }

    public void addItem(){
        System.out.println("Producer is producing, current size : "+ items.size());
        items.add(new Object());
    }

    public void removeItem(){
        System.out.println("Consumer is consuming, current size : "+ items.size());
        items.remove();
    }
}