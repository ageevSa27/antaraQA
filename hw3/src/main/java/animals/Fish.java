package animals;

import animals.interfaces.Swim;
import aviary.Size;

public class Fish extends Herbivore implements Swim {


    public Fish(String name, Size size) {
        super(name, size);
    }

    @Override
    public void swim() {
        System.out.println("Рыбка уплыла");
    }


}

