package DesignPatterns.Observer;

import DesignPatterns.Observer.OnOrderPlaceSubscribers.InventoryUpdate;
import DesignPatterns.Observer.OnOrderPlaceSubscribers.InvoiceGeneration;
import DesignPatterns.Observer.OnOrderPlaceSubscribers.SendNotification;

public class App {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();

        amazon.registerSubscriber(new InventoryUpdate());
        amazon.registerSubscriber(new InvoiceGeneration());
        amazon.registerSubscriber(new SendNotification());


        amazon.placeOrder();
    }
}
