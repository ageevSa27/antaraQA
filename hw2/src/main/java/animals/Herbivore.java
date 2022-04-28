package animals;

import food.Food;
import food.Grass;

public class Herbivore extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Покушал");

        } else System.out.println("травоядные не едят мясо");
    }
}