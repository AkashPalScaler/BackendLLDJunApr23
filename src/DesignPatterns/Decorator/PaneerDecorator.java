package DesignPatterns.Decorator;

public class PaneerDecorator implements MenuItem {

    final Integer cost = 50;
    MenuItem wrapped;

    public PaneerDecorator(MenuItem wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void getDescription() {
        wrapped.getDescription();
        System.out.println("Paneer addon is added");
    }

    @Override
    public Integer getCost() {
        return wrapped.getCost() + cost;
    }
}
