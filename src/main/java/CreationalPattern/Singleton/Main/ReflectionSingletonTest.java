package CreationalPattern.Singleton.Main;

import CreationalPattern.Singleton.Entity.*;

import java.lang.reflect.Constructor;

/**
 * @author MPHuy on 18/11/2021
 */
public class ReflectionSingletonTest {
    public static void main(String[] args) {
        EagerInitializedSingleton instanceOne =  EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors =
                    EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton)
                        constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("instanceOne "+instanceOne.hashCode());
        System.out.println("instanceTwo "+instanceTwo.hashCode());
    }
}