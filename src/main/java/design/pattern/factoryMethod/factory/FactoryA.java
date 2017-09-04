package design.pattern.factoryMethod.factory;

import design.pattern.factoryMethod.product.ProductA;
import design.pattern.factoryMethod.product.ProductAbstract;

/**
 * Created by sky on 2017/8/30.
 */
public class FactoryA extends FactoryAbstract {

    @Override
    public ProductAbstract create(){
        return new ProductA();
    }
}
