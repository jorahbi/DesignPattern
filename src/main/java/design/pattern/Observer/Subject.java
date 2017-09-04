package design.pattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sky on 2017/9/1.
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState(){
        return this.state;
    }

    public void attach(Observer observer){
        this.observers.add(observer);
    }

    public void setState(int state){
        this.state = state;
        this.notifyAllObservers();
    }

    private void notifyAllObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
