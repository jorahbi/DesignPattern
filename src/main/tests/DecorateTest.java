import design.pattern.decorate.*;

/**
 * 装饰器
 */
public class DecorateTest {

    public static void main(String[] args){
        Human person = new Person();
        Decorate decorate = new DecorateThree(new DecorateTwo(new DecorateOne(person)));
        decorate.wearClothes();
        decorate.walkToWhere();

    }

}
