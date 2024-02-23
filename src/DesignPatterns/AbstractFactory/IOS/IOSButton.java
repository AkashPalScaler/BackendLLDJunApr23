package DesignPatterns.AbstractFactory.IOS;

import DesignPatterns.AbstractFactory.Button;

public class IOSButton implements Button {
    @Override
    public void onClick() {
        System.out.println("Clicking the IOS Button");
    }
}
