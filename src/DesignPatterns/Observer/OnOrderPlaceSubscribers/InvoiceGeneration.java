package DesignPatterns.Observer.OnOrderPlaceSubscribers;

import DesignPatterns.Observer.OrderPlacedSubscriber;

public class InvoiceGeneration implements OrderPlacedSubscriber {

    @Override
    public void onOrderPlace() {
        System.out.println("Invoice is generated");
    }
}
