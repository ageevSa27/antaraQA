package animals;

import animals.interfaces.Fly;
import animals.interfaces.Swim;
import animals.interfaces.Voice;

public class Duck extends Сarnivorous implements Fly, Voice, Swim {
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
