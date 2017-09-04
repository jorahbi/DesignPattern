package design.pattern.factory.factory;

import design.pattern.factory.product.Circle;
import design.pattern.factory.product.Shape;
import design.pattern.factory.product.Square;

/**
 * 工厂模式
 */
public class ShapeFactory {

    public static final String CIRCLE = "circle";
    public static final String SQUARE = "square";

    public static Shape factory(String type){

        switch (type){
            case ShapeFactory.CIRCLE:
                return new Circle();
            case ShapeFactory.SQUARE:
                return new Square();
            default:
                return null;
        }
    }
}
