package animals;

public class Giraffe extends Herbivore implements Run {
    @Override
    public void run() {
        System.out.println("Жираф умчался на длинных лапах");
    }
}