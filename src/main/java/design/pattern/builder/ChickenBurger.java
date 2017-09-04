package design.pattern.builder;

/**
 * Created by sky on 2017/8/31.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "ChickenBurger extends Burger";
    }


    @Override
    public float price() {
        return 8.5f;
    }
}
