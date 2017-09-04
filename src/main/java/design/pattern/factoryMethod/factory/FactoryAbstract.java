package design.pattern.factoryMethod.factory;

import design.pattern.factoryMethod.product.ProductAbstract;

/**
 * 工厂方法模式.
 */
public abstract class FactoryAbstract {

    public abstract ProductAbstract create();
}
