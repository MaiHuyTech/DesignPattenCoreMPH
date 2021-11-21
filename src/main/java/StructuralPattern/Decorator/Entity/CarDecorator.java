package StructuralPattern.Decorator.Entity;

/**
 * @author MPHuy on 21/11/2021
 */
//Decorator
public class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car c){
        this.car=c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
