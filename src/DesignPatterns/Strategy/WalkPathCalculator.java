package DesignPatterns.Strategy;

public class WalkPathCalculator implements IPathCalculatorStrategy {
    @Override
    public void calulcatePath(String source, String destination) {
        System.out.println("Calculating path for walk");
    }
}
