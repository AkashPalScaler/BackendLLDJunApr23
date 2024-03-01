package DesignPatterns.Strategy;

public class GoogleMap2 {

    public void findPath(String source, String destination, String mode){
       IPathCalculatorStrategy strategy = PathCalculatorFactory.getPathStrategy(mode);
       strategy.calulcatePath(source, destination);
        //other lines of login common for all strategies
    }
}
