package StructuralPattern.Decorator.Entity;

/**
 * @author MPHuy on 21/11/2021
 */
public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car c) {
        super(c);
    }
    @Override
    public void assemble(){
        car.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}
