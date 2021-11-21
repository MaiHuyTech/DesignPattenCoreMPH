package StructuralPattern.Composite.Entity;

/**
 * @author MPHuy on 21/11/2021
 */
public class Circle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color "+fillColor);
    }
}
