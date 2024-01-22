package ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize;
    private List<Object> items;

    public int getMaxSize(){
        return maxSize;
    }

    public List<Object> getItems(){
        return items;
    }

    public Store(int size){
        maxSize = size;
        items = new ArrayList<Object>();
    }

    public void addItem(){
        System.out.println("Producer is producing, current size : "+ items.size());
        items.add(new Object());
    }

    public void removeItem(){
        System.out.println("Consumer is consuming, current size : "+ items.size());
        items.remove(items.size()-1);
    }
}