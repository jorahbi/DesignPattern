package design.pattern.decorate;

/**
 * Created by sky on 2017/9/1.
 */
public abstract class Decorate implements Human{

    private Human human;

    public Decorate(Human human){
        this.human = human;
    }

    public void wearClothes(){
        this.human.wearClothes();
    }

    public void walkToWhere(){
        this.human.walkToWhere();
    }
}
