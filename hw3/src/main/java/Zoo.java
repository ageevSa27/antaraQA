import animals.*;
import aviary.Aviary;
import aviary.Size;

public class Zoo {
    public static void main(String[] args) {
        Duck duck = new Duck("Кряка", Size.SMALL);
        Fish fish = new Fish("Карасик", Size.SMALL);
        Giraffe giraffe = new Giraffe("Рафки", Size.BIG);
        Lion lion = new Lion("Симба", Size.MEDIUM);
        Lion lion2 = new Lion("Муфасса", Size.MEDIUM);

        Aviary<Carnivorous> aviary = new Aviary<>(Size.BIG);
        Aviary<Herbivore> aviary2 = new Aviary<>(Size.BIG);

        aviary.addAnimal(lion);
        aviary.addAnimal(lion2);
        aviary.addAnimal(duck);
        aviary2.addAnimal(giraffe);
        aviary2.addAnimal(fish);

        aviary.removeAnimal(duck);
        aviary.getSet();

        aviary.removeAnimal(aviary.getAnimal("Симба")); // получает элемент животного и удаляет его из вольера
        aviary.getSet();
    }
}
