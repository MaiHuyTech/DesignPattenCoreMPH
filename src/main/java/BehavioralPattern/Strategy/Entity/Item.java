package BehavioralPattern.Strategy.Entity;

/**
 * @author MPHuy on 21/11/2021
 */
public class Item {
    private String upcCode;
    private int price;

    public Item(String upc, int cost){
        this.upcCode=upc;
        this.price=cost;
    }
    public String getUpcCode() {
        return upcCode;
    }
    public int getPrice() {
        return price;
    }
}
