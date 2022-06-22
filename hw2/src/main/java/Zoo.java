import animals.*;
import animals.interfaces.Swim;
import food.Grass;
import food.Meat;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

        Duck duck = new Duck();
        Duck duck2 = new Duck();
        Fish fish = new Fish();
        Fish fish2 = new Fish();
        Fish fish3 = new Fish();
        Giraffe giraffe = new Giraffe();
        Leopard leopard = new Leopard();
        Lion lion = new Lion();
        Zebra zebra = new Zebra();
        Worker worker = new Worker();
        Meat meat = new Meat();
        Grass grass = new Grass();
        worker.feed(fish, grass);
        worker.feed(giraffe, meat);
        worker.feed(lion, meat);
        worker.feed(zebra, meat);

        worker.getVoice(duck);
        worker.getVoice(lion);
        worker.getVoice(zebra);

        giraffe.run();

        ArrayList<Swim> pond = new ArrayList<>();
        pond.add(fish);
        pond.add(fish2);
        pond.add(fish3);
        pond.add(duck);
        pond.add(duck2);
        pond.forEach(Swim::swim);

    }
}