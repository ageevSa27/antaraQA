package animals;

import food.Food;
import food.Meat;

public class Сarnivorous extends Animal{
    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Покушал");
        } else System.out.println("хищники не едят траву");

    }
}
