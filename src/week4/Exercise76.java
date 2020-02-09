package week4;

import libs.Menu;

import java.util.ArrayList;

public class Exercise76 {
    public static void main(String[] args) {
      Menu dinnerMenu = new Menu();
        dinnerMenu.addMeal("Hamburger");
        dinnerMenu.addMeal("Fish'n'Chips");
        dinnerMenu.addMeal("Sauerkraut");
        dinnerMenu.addMeal("Sauerkraut");


        dinnerMenu.printMeals();
        System.out.println(dinnerMenu);
        dinnerMenu.clearMenu();
        System.out.println(dinnerMenu);

    }

}
