import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Calc.calculate();
    }


    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String s = scanner.next();
        System.out.println(calculator(a, b, s));

    }

    public static int calculator(int a, int b, String s) {
        switch (s) {
            case ("+"):
                return a + b;
            case ("-"):
                return a - b;
            case ("*"):
                return a * b;
            case ("/"):
                return a / b;
            default:
                throw new IllegalArgumentException("Неизвестное действие: " + s);
        }

    }

}
