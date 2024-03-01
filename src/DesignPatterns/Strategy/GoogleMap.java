package DesignPatterns.Strategy;

public class GoogleMap {
    IPathCalculatorStrategy pathCalculatorStrategy;

    public GoogleMap(IPathCalculatorStrategy pathCalculatorStrategy) {
        this.pathCalculatorStrategy = pathCalculatorStrategy;
    }

    public void findPath(String source, String destination){
        pathCalculatorStrategy.calulcatePath(source, destination);
    }
}
