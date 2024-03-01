package DesignPatterns.Observer.OnOrderPlaceSubscribers;

import DesignPatterns.Observer.OrderPlacedSubscriber;

public class InventoryUpdate implements OrderPlacedSubscriber {
    @Override
    public void onOrderPlace() {
        System.out.println("Inventory is getting updated");
    }
}
