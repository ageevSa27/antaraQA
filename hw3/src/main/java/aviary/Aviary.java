package aviary;

import animals.Animal;

import java.util.HashSet;
import java.util.Set;

public class Aviary<T extends Animal> {
    private final Size size;
    private final Size[] allSize = Size.values();
    private Set<T> set = new HashSet<>();

    public Aviary(Size size) {
        this.size = size;
    }

//    private Set<T> set = new HashSet<>();


    public void addAnimal(T animal) {

        if (animal.getSize().getNum() <= size.getNum()) {
            set.add(animal);
        } else System.out.println("слишком большое животное");
    }

    public void removeAnimal(T animal) {
        set.remove(animal);
    }


    public void getSet() {
        for (T x : set) {
            System.out.println(x.getName());

        }
    }

    public T getAnimal(String name) {
        for (T i : set) {
            if (i.getName().equals(name))
                return i;


        }
        return null;
    }


}
