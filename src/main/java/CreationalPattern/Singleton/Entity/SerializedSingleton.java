package CreationalPattern.Singleton.Entity;

/**
 * @author MPHuy on 18/11/2021
 */
import java.io.Serializable;
public class SerializedSingleton implements Serializable{
    private static final long serialVersionUID = -7604766932017737115L;
    private SerializedSingleton(){}

    private static class SingletonHelper{
        private static final SerializedSingleton instance = new
                SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }

}