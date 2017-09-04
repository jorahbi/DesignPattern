package design.pattern.builder;

/**
 * 饮料
 */
public abstract class ColdDrink implements Item{

    @Override
    public Package packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}
