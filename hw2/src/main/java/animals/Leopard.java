package animals;

import animals.interfaces.Run;
import animals.interfaces.Voice;

public class Leopard extends Carnivorous implements Run, Voice {

    @Override
    public void run() {
        System.out.println("Леопард побежал");
    }

    @Override
    public String voice() {
        return "Урррр";
    }
}
