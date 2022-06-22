package animals;

import animals.interfaces.Fly;
import animals.interfaces.Swim;
import animals.interfaces.Voice;
import aviary.Size;

public class Duck extends Carnivorous implements Fly, Voice, Swim {


    public Duck(String name, Size size) {
        super(name, size);
    }

    @Override
    public void fly() {
        System.out.println("Уточка улетела в закат");

    }

    @Override
    public String voice() {
        return "Кря-кря";
    }

    @Override
    public void swim() {
        System.out.println("Уточка уплыла");
    }





}
