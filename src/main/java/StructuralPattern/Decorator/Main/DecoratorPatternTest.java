package StructuralPattern.Decorator.Main;

import StructuralPattern.Decorator.Entity.BasicCar;
import StructuralPattern.Decorator.Entity.Car;
import StructuralPattern.Decorator.Entity.LuxuryCar;
import StructuralPattern.Decorator.Entity.SportsCar;

/**
 * @author MPHuy on 21/11/2021
 */
public class DecoratorPatternTest {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new
                BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
