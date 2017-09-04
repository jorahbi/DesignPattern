package design.pattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者
 */
public abstract class Observer {

    protected Subject subject;
    abstract void update();
}
