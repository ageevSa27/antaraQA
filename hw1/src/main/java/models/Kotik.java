package models;

import java.util.Objects;

public class Kotik {
    private int satiety = -1;
    private static int number;
    private int prettiness, weight;
    private String name, meow;

    public Kotik(int prettiness, int weight, String name, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        number++;
    }

    public Kotik() {
        number++;
    }

    public void setKotik(int prettiness, int weight, String name, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
    }

    public static void setNumber(int number) {
        Kotik.number = number;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public void setPrettiness(int prettiness) {
        this.prettiness = prettiness;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public static int getNumber() {
        return number;
    }

    public boolean play() {
        System.out.println(name.toString() + " поиграл");
        return true;
    }

    public boolean sleep() {
        System.out.println(name.toString() + " поспал");
        return true;
    }

    public boolean chaseMouse() {
        System.out.println(name.toString() + " побегал за мышкой");
        return true;
    }

    public boolean takeAShower() {
        System.out.println(name.toString() + " принял душ");
        return true;
    }

    public boolean eat(int a) {
        satiety = satiety + a;
        System.out.println(name.toString() + " поел");
        return true;
    }

    public boolean eat(int a, String foodName) {
        satiety = satiety + a;
        System.out.println(name.toString() + " поел " + foodName);
        return true;
    }

    public boolean eat() {
        eat(5, "КитиКет");
        return true;
    }


    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
            int action = (int) (Math.random() * 7 + 1);
            if (satiety <= 0) {
                System.out.println(name.toString() + " голоден, будет только есть");
                action = 5;
            }
            switch (action) {
                case (1):
                    play();
                case (2):
                    sleep();
                case (3):
                    chaseMouse();
                case (4):
                    takeAShower();
                case (5):
                    eat();
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kotik kotik = (Kotik) o;
        return Objects.equals(meow, kotik.meow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meow);
    }

    @Override
    public String toString() {
        return name;
    }
}
