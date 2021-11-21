package BehavioralPattern.Strategy.Main;

import BehavioralPattern.Strategy.Entity.CreditCardStrategy;
import BehavioralPattern.Strategy.Entity.Item;
import BehavioralPattern.Strategy.Entity.PaypalStrategy;
import BehavioralPattern.Strategy.Entity.ShoppingCart;

/**
 * @author MPHuy on 21/11/2021
 */
public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
        //pay by credit card
        cart.pay(new CreditCardStrategy("Pankaj Kumar","1234567890123456", "786", "12/15"));
    }
}
