package animals;

import aviary.Size;

public class Lion extends Carnivorous implements Run, Voice {


    public Lion(String name, Size size) {
        super(name, size);
    }

    @Override
    public void run() {
        System.out.println("Лев побежал");
    }

    @Override
    public String voice() {
        return "АРРРР";
    }

}
