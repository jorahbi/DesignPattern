import design.pattern.builder.Meal;
import design.pattern.builder.MealBuilder;

/**
 * Created by sky on 2017/8/31.
 */
public class MealBuilderTest {
    public static void main(String[] args){

        MealBuilder mealBuilder = new MealBuilder();
        System.out.println("veg burger");
        Meal meal = mealBuilder.prepareVegMeal();
        meal.showItems();
        System.out.println("Total Cost: " + meal.getCost());

        System.out.println("\nnot veg burger");
        Meal mea2 = mealBuilder.prepareNotVegMeal();
        mea2.showItems();
        System.out.println("Total Cost: " + mea2.getCost());
    }
}
