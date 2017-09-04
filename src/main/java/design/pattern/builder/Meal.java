package design.pattern.builder;

import java.util.ArrayList;

/**
 * Created by sky on 2017/8/31.
 */
public class Meal {

    private ArrayList<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : this.items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for(Item item : this.items){
            System.out.println("name: " + item.name());
            System.out.println("package: " + item.packing().pack());
            System.out.println("price: " + item.price());
        }
    }
}
