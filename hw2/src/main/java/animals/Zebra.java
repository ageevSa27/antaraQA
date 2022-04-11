package animals;

public class Zebra extends Herbivore implements Run, Voice{
    @Override
    public void run() {
        System.out.println("Зебра умчалась галопом");
    }

    @Override
    public String voice() {
        return "Фырк-фырк";
    }
}

