package DesignPatterns.AbstractFactory;

import javax.swing.*;

public class App {
    public static void styleButton(Button b, String style){
        System.out.println("The button getting clicked is");
        b.onClick();
    }
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory androidUIFactory = flutter.createFactory("Android");
        // OR
//        FlutterAndroid flutterAndroid = new FlutterAndroid();
//         UIFactory androidUIFactory = flutterAndroid.createUIFactory();

        Button androidButton = androidUIFactory.createButton();
        Dropdown androidDD = androidUIFactory.createDropdown();
        androidButton.onClick();
        androidDD.onClick();

        UIFactory iosUIFactory = flutter.createFactory("IOS");
        // OR
//        FlutterIOS flutterIOS = new FlutterIOS();
//        UIFactory iosUIFactory = flutterIOS.createUIFactory();


        Button iosButton = iosUIFactory.createButton();
        Dropdown iosDD = iosUIFactory.createDropdown();

        iosButton.onClick();
        iosDD.onClick();


        styleButton(androidButton, "size:0");
        styleButton(iosButton, "size:0");


    }
}
