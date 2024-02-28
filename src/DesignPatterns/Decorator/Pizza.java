package DesignPatterns.Decorator;

public class Pizza implements MenuItem {
    final Integer cost = 200;

    @Override
    public void getDescription() {
        System.out.println("Pizza item is added");
    }

    @Override
    public Integer getCost() {
        return cost;
    }
}
