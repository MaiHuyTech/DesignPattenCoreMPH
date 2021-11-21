package StructuralPattern.Composite.Main;

import StructuralPattern.Composite.Entity.Circle;
import StructuralPattern.Composite.Entity.Drawing;
import StructuralPattern.Composite.Entity.Shape;
import StructuralPattern.Composite.Entity.Triangle;

/**
 * @author MPHuy on 21/11/2021
 */
public class TestCompositePattern {
    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
    }
}
