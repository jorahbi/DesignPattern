package design.pattern.prototype;

/**
 * Created by sky on 2017/8/31.
 */
public class Rectangle extends Shape {

    public Rectangle(){
        this.type = "rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
