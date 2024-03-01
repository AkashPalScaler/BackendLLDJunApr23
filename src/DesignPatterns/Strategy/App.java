package DesignPatterns.Strategy;

public class App {
    public static void main(String[] args) {
        GoogleMap gmap1 = new GoogleMap(new WalkPathCalculator());
        gmap1.findPath("Jammu", "kashmir");
    }
}
