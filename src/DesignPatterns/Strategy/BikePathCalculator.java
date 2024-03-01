package DesignPatterns.Strategy;

public class BikePathCalculator implements IPathCalculatorStrategy {
    @Override
    public void calulcatePath(String source, String destination) {
        System.out.println("Calculating path for bike");
    }
}
