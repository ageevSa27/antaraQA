package animals;

import animals.interfaces.Run;
import animals.interfaces.Voice;

public class Lion extends Carnivorous implements Run, Voice {

    @Override
    public void run() {
        System.out.println("Лев побежал");
    }

    @Override
    public String voice() {
        return "АРРРР";
    }
}
