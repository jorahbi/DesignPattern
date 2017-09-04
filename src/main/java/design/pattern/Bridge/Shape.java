package design.pattern.Bridge;

/**
 * Created by sky on 2017/9/1.
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void shape();
}
