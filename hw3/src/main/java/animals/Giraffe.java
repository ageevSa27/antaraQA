package animals;

import animals.interfaces.Run;
import aviary.Size;

public class Giraffe extends Herbivore implements Run {


    public Giraffe(String name, Size size) {
        super(name, size);
    }

    @Override
    public void run() {
        System.out.println("Жираф умчался на длинных лапах");

    }


}