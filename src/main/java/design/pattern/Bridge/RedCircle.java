package design.pattern.Bridge;

/**
 * Created by sky on 2017/9/1.
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("red circle: " + radius + " " + x + " " + y);
    }
}
