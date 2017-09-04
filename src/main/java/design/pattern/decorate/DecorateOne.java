package design.pattern.decorate;

/**
 * Created by sky on 2017/9/1.
 */
public class DecorateOne extends Decorate {

    public DecorateOne(Human human) {
        super(human);
    }

    public void goHome(){
        System.out.println("进房子");
    }

    public void findMap(){
        System.out.println("书房找地图");
    }

    @Override
    public void walkToWhere(){
        super.walkToWhere();
        this.findMap();

    }

    @Override
    public void wearClothes(){
        super.wearClothes();
        this.goHome();
    }
}
