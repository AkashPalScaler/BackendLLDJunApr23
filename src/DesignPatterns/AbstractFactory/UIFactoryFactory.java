package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.Android.AndroidUIFactory;
import DesignPatterns.AbstractFactory.IOS.IOSUIFactory;

import java.util.HashMap;

public class UIFactoryFactory {

    //This does not violate SRP/OCP
    // as the purpose of the method and
    // the class is if/else
    public static UIFactory createUIFactory(String platform){
        if(platform == "Android"){
            return new AndroidUIFactory();
        }
        if(platform == "IOS"){
            return new IOSUIFactory();
        }
        return null;

    }
}

