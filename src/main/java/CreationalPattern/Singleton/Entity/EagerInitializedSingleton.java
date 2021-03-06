package CreationalPattern.Singleton.Entity;

/**
 * @author MPHuy on 18/11/2021
 */
public class EagerInitializedSingleton {
// create object new in class
    private static final EagerInitializedSingleton instance = new
            EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}
    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}