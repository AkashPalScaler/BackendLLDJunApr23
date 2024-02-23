package DesignPatterns.AbstractFactory.IOS;

import DesignPatterns.AbstractFactory.Dropdown;

public class IOSDropdown implements Dropdown {
    @Override
    public void onClick() {
        System.out.println("Clicking the IOS dropdown");
    }
}
