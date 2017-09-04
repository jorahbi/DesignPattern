package design.pattern.decorate;

/**
 * Created by sky on 2017/9/1.
 */
public class DecorateThree extends Decorate {

    public DecorateThree(Human human) {
        super(human);
    }

    public void goHome(){
        System.out.println("找到件D&G");
    }

    public void findMap(){
        System.out.println("找到黄金");
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
