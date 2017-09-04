package design.pattern.abstractFactory.factory;

import design.pattern.abstractFactory.product.Color;
import design.pattern.abstractFactory.product.Shape;
import design.pattern.abstractFactory.product.Square;

/**
 * Created by sky on 2017/8/30.
 */
public class ShapeFactory extends AbstractFactory {

    public final static String SQUARE = "square";


    public Shape getShape(String type){
        switch (type) {
            case ShapeFactory.SQUARE:
                return new Square();
            default:
                return null;
        }
    }

    public Color getColor(String type){
        return null;
    }
}
