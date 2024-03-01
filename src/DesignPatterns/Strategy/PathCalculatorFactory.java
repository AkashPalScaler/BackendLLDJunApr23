package DesignPatterns.Strategy;

public class PathCalculatorFactory {

    public static IPathCalculatorStrategy carStrategy = new CarPathCalculator();
    public static IPathCalculatorStrategy getPathStrategy(String mode){
        if(mode == "car"){
            return carStrategy;
        }
        if(mode == "bike"){
            return new BikePathCalculator();
        }
        if(mode == "walk"){
            return new WalkPathCalculator();
        }
        return null;
    }
}
