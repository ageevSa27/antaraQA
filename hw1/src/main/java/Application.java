import models.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik(100,12,"Барсик","мяу");
        Kotik kotik2 = new Kotik();
        kotik2.setKotik(65,24,"Рыжик","МЯЯЯЯЯЯЯУ");
        kotik1.liveAnotherDay();
        kotik2.liveAnotherDay();
        System.out.println(kotik1.equals(kotik2));
        System.out.print("Колличество котиков: ");
        System.out.println(Kotik.getNumber());

    }
}
