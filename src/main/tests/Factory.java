import design.pattern.factory.factory.ShapeFactory;

/**
 * Created by sky on 2017/8/30.
 */
public class Factory {

    public static void main(String[] args){
        ShapeFactory.factory(ShapeFactory.CIRCLE).draw();
    }
}
