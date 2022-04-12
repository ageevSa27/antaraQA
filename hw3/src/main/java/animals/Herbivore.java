package animals;

import aviary.Size;
import food.Food;
import food.Grass;
import food.Meat;
import food.exception.WrongFoodException;

public abstract class Herbivore extends Animal {


    public Herbivore(String name, Size size) {
        super(name, size);
    }

    @Override
    public void eat(Food food)  {
        try {
            if (food instanceof Grass) {
                System.out.println("Покушал");
            } else if (food instanceof Meat)
                throw new WrongFoodException();
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }

    }
}