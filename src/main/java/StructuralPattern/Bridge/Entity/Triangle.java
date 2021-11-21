package StructuralPattern.Bridge.Entity;

/**
 * @author MPHuy on 21/11/2021
 */
public class Triangle extends Shape{
    //private int Location = 31;
    public Triangle(Color c) {
        super(c);
      //  this.Location = Location;
    }

//    @Override
//    public String toString() {
//        return "Triangle{" +
//                "color=" + color +
//                ", Location=" + Location +
//                '}';
//    }

    @Override
    public void applyColor() {
        System.out.println("Triangle filled with ");
            color.applyColor();
    }

}
