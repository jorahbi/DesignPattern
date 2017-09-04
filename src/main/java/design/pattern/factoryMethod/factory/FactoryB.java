package design.pattern.factoryMethod.factory;

import design.pattern.factoryMethod.product.ProductAbstract;
import design.pattern.factoryMethod.product.ProductB;

/**
 * Created by sky on 2017/8/30.
 */
public class FactoryB extends FactoryAbstract {

    @Override
    public ProductAbstract create(){
        return new ProductB();
    }
}
