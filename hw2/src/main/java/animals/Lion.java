package animals;

public class Lion extends Сarnivorous implements Run, Voice {

    @Override
    public void run() {
        System.out.println("Лев побежал");
    }

    @Override
    public String voice() {
        return "АРРРР";
    }
}
