package design.pattern.Bridge;

/**
 * Created by sky on 2017/9/1.
 */
public class Circle extends Shape {

    private int radius, x, y;

    public Circle(int radius, int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void shape() {
        this.drawAPI.drawCircle(this.radius, this.x, this.y);
    }
}
