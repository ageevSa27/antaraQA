package aviary;

public enum Size {

    SMALL("маленький", 1),
    MEDIUM("средний", 2),
    BIG("Болшой", 3);

    private final int num;

    Size(String name, int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }


}
