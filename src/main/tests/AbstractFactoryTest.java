/**
 * 抽像工厂.
 */

import design.pattern.abstractFactory.factory.AbstractFactory;
import design.pattern.abstractFactory.factory.ColorFactory;
import design.pattern.abstractFactory.factory.FactoryProduct;
import design.pattern.abstractFactory.factory.ShapeFactory;
import design.pattern.abstractFactory.product.Shape;

public class AbstractFactoryTest {

    public static void main(String[] args){
        AbstractFactory af1 = new FactoryProduct().getFactory(AbstractFactory.COLOR);
        AbstractFactory af2 = new FactoryProduct().getFactory(AbstractFactory.SHAPE);
        af1.getColor(ColorFactory.RED).draw();
        Shape square =  af2.getShape(ShapeFactory.SQUARE);
        square.draw();
    }
}
