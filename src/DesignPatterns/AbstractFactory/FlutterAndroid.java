package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.Android.AndroidUIFactory;

public class FlutterAndroid implements FlutterInterface {
    @Override
    public UIFactory createUIFactory() {
        return new AndroidUIFactory();
    }
}
