package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    List<OrderPlacedSubscriber> opsList;

    public Amazon() {
        this.opsList = new ArrayList<>();
    }

    public void registerSubscriber(OrderPlacedSubscriber ops){
        opsList.add(ops);
    }

    public void unRegisterSubscriber(OrderPlacedSubscriber ops){
        opsList.remove(ops);
    }
    public void placeOrder(){
        System.out.println("Order is placed");
        for(OrderPlacedSubscriber ops: opsList){
            ops.onOrderPlace();
        }
    }
}
