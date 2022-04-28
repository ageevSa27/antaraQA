package animals;

import animals.interfaces.Run;
import animals.interfaces.Voice;

public class Zebra extends Herbivore implements Run, Voice {
    @Override
    public void run() {
        System.out.println("Зебра умчалась галопом");
    }

    @Override
    public String voice() {
        return "Фырк-фырк";
    }
}

