package StructuralPattern.Bridge.Main;

import StructuralPattern.Bridge.Entity.*;

/**
 * @author MPHuy on 21/11/2021
 */
public class BridgePatternTest {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();
       //System.out.println(tri);
        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
       // System.out.println(pent);
    }
}
