package BehavioralPattern.State.Entity;

/**
 * @author MPHuy on 21/11/2021
 */
public class TVStartState implements State {
    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }
}
