package animals;

import aviary.Size;

public class Leopard extends Carnivorous implements Run, Voice {


    public Leopard(String name, Size size) {
        super(name, size);
    }

    @Override
    public void run() {
        System.out.println("Леопард побежал");
    }
    @Override
    public String voice() {
        return "Урррр";
    }
}
