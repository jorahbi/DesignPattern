package design.pattern.decorate;

/**
 * Created by sky on 2017/9/1.
 */
public class DecorateTwo extends Decorate {

    public DecorateTwo(Human human) {
        super(human);
    }

    public void goHome(){
        System.out.println("衣柜找找");
    }

    public void findMap(){
        System.out.println("地图上找宝藏");
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
