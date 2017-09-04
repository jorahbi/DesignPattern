package design.pattern.decorate;

/**
 * Created by sky on 2017/9/1.
 */
public class Person implements Human {
    @Override
    public void wearClothes() {
        System.out.println("穿什么呢?");
    }

    @Override
    public void walkToWhere() {
        System.out.println("去哪呢?");
    }
}
