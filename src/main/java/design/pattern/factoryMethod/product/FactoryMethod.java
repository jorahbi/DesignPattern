package design.pattern.factoryMethod.product;

import design.pattern.factory.factory.ShapeFactory;
import design.pattern.factoryMethod.factory.FactoryA;
import design.pattern.factoryMethod.factory.FactoryB;

/**
 * Created by sky on 2017/8/30.
 */
public class FactoryMethod {

    public static void main(String[] args){
        new FactoryA().create().output();
        new FactoryB().create().output();
    }
}
