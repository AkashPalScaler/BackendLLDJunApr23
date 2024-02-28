package DesignPatterns.Decorator;


import java.awt.*;

public class App {
    public static void main(String[] args) {

        MenuItem pizza = new CheeseDecorator(
                        new PaneerDecorator(new Pizza()));

        MenuItem burger = new PaneerDecorator(
                            new CheeseDecorator(
                                    new Burger()));
        /*
        MenuItem burg = new Burger();
        MenuItem cheese = new CheeseDecorator(burg);
        MenuItem item = new PaneerDecorator(cheese);

        INotifier notifier = new SMSNotifier(
                                new EmailNotifier(
                                    new Notifier()));

        */

        pizza.getDescription();
        System.out.println("Item total is "+pizza.getCost() + "Rs");

        System.out.println("********");

        burger.getDescription();
        System.out.println("Item total is "+burger.getCost() + "Rs");


    }
}
