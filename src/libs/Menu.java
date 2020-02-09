package libs;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // Implement the methods here
    public void addMeal(String meal) {

       if(!this.meals.contains(meal)) {
           meals.add(meal);
       }
    }

    public void printMeals() {
        for (String x : meals) {
            System.out.println(x);
        }
    }

    public void clearMenu() {
        meals.removeAll(meals);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "meals=" + meals +
                '}';
    }
}
