package CreationalPattern.Singleton.Entity;

/**
 * @author MPHuy on 18/11/2021
 */
// goi lai class chua object
public class BillPughSingleton {
    private BillPughSingleton(){}

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new
                BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}