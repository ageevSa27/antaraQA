package animals;

import aviary.Size;
import food.Food;
import food.Grass;
import food.Meat;
import food.exception.WrongFoodException;

public abstract class Carnivorous extends Animal{
    public Carnivorous(String name, Size size) {
        super(name, size);
    }

    @Override
    public void eat(Food food)  {
        try {
            if (food instanceof Meat ) {
                System.out.println("Покушал");
            } else if (food instanceof Grass)
                throw new WrongFoodException();
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }

    }
}
