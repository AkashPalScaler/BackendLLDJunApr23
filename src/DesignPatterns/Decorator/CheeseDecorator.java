package DesignPatterns.Decorator;

public class CheeseDecorator implements MenuItem {
    final Integer cost = 30;
    MenuItem wrapped;


    public CheeseDecorator(MenuItem wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void getDescription() {
        wrapped.getDescription();
        System.out.println("Cheese addon is added");
    }

    @Override
    public Integer getCost() {
        return wrapped.getCost() + cost;
    }
}
