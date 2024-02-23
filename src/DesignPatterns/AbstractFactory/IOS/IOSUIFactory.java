package DesignPatterns.AbstractFactory.IOS;

import DesignPatterns.AbstractFactory.Button;
import DesignPatterns.AbstractFactory.Dropdown;
import DesignPatterns.AbstractFactory.UIFactory;

public class IOSUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
