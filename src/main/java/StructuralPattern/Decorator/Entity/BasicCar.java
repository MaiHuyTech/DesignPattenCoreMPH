package StructuralPattern.Decorator.Entity;

/**
 * @author MPHuy on 21/11/2021
 */
//. Component Implementation
public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}
