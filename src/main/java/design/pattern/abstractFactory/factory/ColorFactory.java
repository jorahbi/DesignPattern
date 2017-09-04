package design.pattern.abstractFactory.factory;

import design.pattern.abstractFactory.product.Color;
import design.pattern.abstractFactory.product.Red;
import design.pattern.abstractFactory.product.Shape;

/**
 * Created by sky on 2017/8/30.
 */
public class ColorFactory extends AbstractFactory {

    public final static String RED = "red";


    public Shape getShape(String type){

        return null;
    }

    public Color getColor(String type){
        switch (type) {
            case ColorFactory.RED:
                return new Red();
            default:
                return null;
        }
    }
}
