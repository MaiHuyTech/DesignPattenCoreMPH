package StructuralPattern.Composite.Entity;

/**
 * @author MPHuy on 21/11/2021
 */
public class Triangle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color "+fillColor);
    }
}