package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.IOS.IOSUIFactory;

public class FlutterIOS implements FlutterInterface {
    @Override
    public UIFactory createUIFactory() {
        return new IOSUIFactory();
    }
}
