package DesignPatterns.AbstractFactory.Android;

import DesignPatterns.AbstractFactory.Dropdown;

public class AndroidDropdown implements Dropdown {
    @Override
    public void onClick() {
        System.out.println("Clicking the Android dropdown");
    }
}
