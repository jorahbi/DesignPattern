package design.pattern.abstractFactory.factory;

/**
 * Created by sky on 2017/8/30.
 */
public class FactoryProduct {

    public static AbstractFactory getFactory(String type){
        switch (type){
            case AbstractFactory.SHAPE:
                return new ShapeFactory();
            case AbstractFactory.COLOR:
                return new ColorFactory();
            default:
                return null;
        }
    }
}
