import design.pattern.prototype.Rectangle;
import design.pattern.prototype.Shape;
import design.pattern.prototype.ShapeCache;
import design.pattern.prototype.Square;

/**
 * Created by sky on 2017/8/31.
 */
public class Prototype {

    public static void main(String[] args){

        ShapeCache.localCache();

        Shape shape = ShapeCache.getCache("1");
        System.out.println(shape.getClass().hashCode() + " 1 " + shape.getType());

        Shape shape1 = ShapeCache.getCache("1");
        System.out.println(shape1.getClass().hashCode() + " 2 " + shape1.getType());

        Shape rectangle = ShapeCache.getCache("2");
        System.out.println(rectangle.getClass().hashCode() + " " + rectangle.getType());
    }
}
