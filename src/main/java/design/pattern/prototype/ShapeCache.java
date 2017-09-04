package design.pattern.prototype;

import java.util.Hashtable;

/**
 * Created by sky on 2017/8/31.
 */
public class ShapeCache {

    private static Hashtable<String, Shape> cache = new Hashtable<String, Shape>();

    public static Shape getCache(String key){
        Shape square = cache.get(key);
        return (Shape)square.clone();
    }

    public static void localCache(){
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        System.out.println(rectangle.getClass().hashCode());
        cache.put(rectangle.getId(), rectangle);
        Square square = new Square();
        square.setId("2");
        System.out.println(square.getClass().hashCode());
        cache.put(square.getId(), square);
    }
}
