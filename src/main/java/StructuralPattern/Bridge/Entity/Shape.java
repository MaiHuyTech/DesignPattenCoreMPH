package StructuralPattern.Bridge.Entity;

/**
 * @author MPHuy on 21/11/2021
 */
public abstract class Shape {
    //Composition - implementor
    protected Color color;
    private int Location;

    //constructor with implementor as input argument
    public Shape(Color c){
        this.color=c;
    }
    abstract public void applyColor();
}

