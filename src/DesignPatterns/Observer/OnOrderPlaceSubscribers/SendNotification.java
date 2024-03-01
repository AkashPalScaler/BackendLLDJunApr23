package DesignPatterns.Observer.OnOrderPlaceSubscribers;

import DesignPatterns.Observer.OrderPlacedSubscriber;

public class SendNotification implements OrderPlacedSubscriber {
    @Override
    public void onOrderPlace() {
        System.out.println("Notifications are sent");
    }
}
