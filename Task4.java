import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input x: ");
        int x = in.nextInt();
        System.out.println("Input y: ");
        int y = in.nextInt();
        System.out.println("Input z: ");
        int z = in.nextInt();
        float med = ((float) (x) + (float) (y) + (float) (z)) / 3;
        System.out.println("Среднее арифметическое:" + med);
        int med2 = (int) (med / 2);
        if (med2 > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}

