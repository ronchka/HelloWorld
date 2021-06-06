import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Курс доллара: ");
        float course = in.nextFloat();
        System.out.print("Количество рублей: ");
        float rubles = in.nextFloat();
        float result = rubles / course;
        System.out.printf("Итого: %.2f долларов", result);
    }
}
