package StructuralPattern.Bridge.Entity;

/**
 * @author MPHuy on 21/11/2021
 */
public class Pentagon extends Shape{
    //private int Location = 011000;

    public Pentagon(Color c) {
        super(c);
        //this.Location = Location;
    }

//    @Override
//    public String toString() {
//        return "Pentagon{" +
//                "Location=" + Location +
//                ", color=" + color +
//                '}';
//    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();
    }
}
