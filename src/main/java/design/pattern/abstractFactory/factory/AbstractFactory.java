package design.pattern.abstractFactory.factory;

import design.pattern.abstractFactory.product.Color;
import design.pattern.abstractFactory.product.Shape;

/**
 * 抽像工厂模式
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String type);
    public abstract Color getColor(String type);


    public static final String SHAPE = "square";
    public static final String COLOR = "color";

}
