package CreationalPattern.AbstractFactory.Entity;

/**
 * @author MPHuy on 18/11/2021
 */
public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}