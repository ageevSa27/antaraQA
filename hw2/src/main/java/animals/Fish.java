package animals;

import animals.interfaces.Swim;

public class Fish extends Herbivore implements Swim {
    @Override
    public void swim() {
        System.out.println("Рыбка уплыла");
    }
}

