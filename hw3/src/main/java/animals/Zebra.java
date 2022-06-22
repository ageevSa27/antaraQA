package animals;

import animals.interfaces.Run;
import animals.interfaces.Voice;
import aviary.Size;

public class Zebra extends Herbivore implements Run, Voice {


    public Zebra(String name, Size size) {
        super(name, size);
    }

    @Override
    public void run() {
        System.out.println("Зебра умчалась галопом");
    }

    @Override
    public String voice() {
        return "Фырк-фырк";
    }
}

