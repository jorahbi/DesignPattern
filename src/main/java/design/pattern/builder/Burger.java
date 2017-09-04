package design.pattern.builder;

/**
 * 食物
 */
public abstract class Burger implements Item{

    @Override
    public Package packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
