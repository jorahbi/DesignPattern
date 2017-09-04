package design.pattern.builder;

/**
 * Created by sky on 2017/8/31.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger extends Burger";
    }


    @Override
    public float price() {
        return 5.0f;
    }
}
