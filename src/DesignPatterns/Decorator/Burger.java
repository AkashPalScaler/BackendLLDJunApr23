package DesignPatterns.Decorator;

public class Burger implements MenuItem {

    final Integer cost = 100;

    @Override
    public void getDescription() {
        System.out.println("Burger item is added");
    }

    @Override
    public Integer getCost() {
        return cost;
    }
}
