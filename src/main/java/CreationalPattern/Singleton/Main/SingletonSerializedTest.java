

/**
 * @author MPHuy on 18/11/2021
 */
package CreationalPattern.Singleton.Main;

import CreationalPattern.Singleton.Entity.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
public class SingletonSerializedTest {
    public static void main(String[] args) throws
            FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton instanceOne =
                SerializedSingleton.getInstance();

        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton)
                in.readObject();
        in.close();

        System.out.println("instanceOnehashCode="+instanceOne.hashCode());
        System.out.println("instanceTwohashCode="+instanceTwo.hashCode());
    }
}