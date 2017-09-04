package design.pattern.builder;

/**
 * Created by sky on 2017/8/31.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return " Pepsi extends ColdDrink";
    }


    @Override
    public float price() {
        return 10.5f;
    }
}
