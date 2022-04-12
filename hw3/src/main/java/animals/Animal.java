package animals;

import aviary.Size;
import food.Food;

import java.util.Objects;

public abstract class Animal {

    private String name;
    private Size size;

    public Animal(String name, Size size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public abstract void eat(Food food);
    public Size getSize(){
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
