package DesignPatterns.AbstractFactory.Android;

import DesignPatterns.AbstractFactory.Button;

public class AndroidButton implements Button {
    @Override
    public void onClick() {
        System.out.println("Clicking the AndroidButton");
    }
}
