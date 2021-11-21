package BehavioralPattern.State.Main;

import BehavioralPattern.State.Entity.State;
import BehavioralPattern.State.Entity.TVContext;
import BehavioralPattern.State.Entity.TVStartState;
import BehavioralPattern.State.Entity.TVStopState;

/**
 * @author MPHuy on 21/11/2021
 */
public class TVRemote {
    public static void main(String[] args) {
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();


        context.setState(tvStopState);
        context.doAction();

    }
}
