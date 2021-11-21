package BehavioralPattern.Observer.Entity;

/**
 * @author MPHuy on 21/11/2021
 */
public interface Observer {

    //method to update the observer, used by subject
    public void update();

    //attach with subject to observe
    public void setSubject(Subject sub);
}

