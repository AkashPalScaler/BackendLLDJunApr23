package DesignPatterns.AbstractFactory.Android;

import DesignPatterns.AbstractFactory.Button;
import DesignPatterns.AbstractFactory.Dropdown;
import DesignPatterns.AbstractFactory.UIFactory;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
