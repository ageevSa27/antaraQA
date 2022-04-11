package animals;

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
