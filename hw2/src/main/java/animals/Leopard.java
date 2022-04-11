package animals;

public class Leopard extends Сarnivorous implements Run, Voice {
    @Override
    public void run() {
        System.out.println("Леопард побежал");
    }
    @Override
    public String voice() {
        return "Урррр";
    }
}
