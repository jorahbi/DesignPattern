import design.pattern.Bridge.Circle;
import design.pattern.Bridge.DrawAPI;
import design.pattern.Bridge.GreenCircle;
import design.pattern.Bridge.RedCircle;

/**
 * 桥接test
 */
public class BridgeTest {

    public static void main(String[] args){
        DrawAPI da1 = new RedCircle();
        DrawAPI da2 = new GreenCircle();

        new Circle(100, 5, 6, da1).shape();
        new Circle(200, 15, 16, da2).shape();
    }

}
