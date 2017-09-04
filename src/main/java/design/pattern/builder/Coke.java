package design.pattern.builder;

/**
 * Created by sky on 2017/8/31.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke extends ColdDrink";
    }


    @Override
    public float price() {
        return 5.5f;
    }
}
