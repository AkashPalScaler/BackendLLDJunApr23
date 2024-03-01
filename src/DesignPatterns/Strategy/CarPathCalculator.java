package DesignPatterns.Strategy;

public class CarPathCalculator implements IPathCalculatorStrategy {
    @Override
    public void calulcatePath(String source, String destination) {
        System.out.println("Calculating path for car");
    }
}
