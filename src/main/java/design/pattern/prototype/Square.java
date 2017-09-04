package design.pattern.prototype;

/**
 * Created by sky on 2017/8/31.
 */
public class Square extends Shape {

    public Square(){
        this.type = "square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
