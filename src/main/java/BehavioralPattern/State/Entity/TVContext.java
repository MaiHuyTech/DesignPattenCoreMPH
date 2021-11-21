package BehavioralPattern.State.Entity;

/**
 * @author MPHuy on 21/11/2021
 */
 //Context Implementation
public class TVContext implements State {
    private State tvState;
    public void setState(State state) {
        this.tvState=state;
    }
    public State getState() {
        return this.tvState;
    }
    @Override
    public void doAction() {
        this.tvState.doAction();
    }
}
