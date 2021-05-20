import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Заполните массив числами: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        final int X = 1;
        final int Y = 2;
        final int Z = 3;

        for (int i = 0; i < size; i++) {
            if (array[i] == X | array[i] == Y | array[i] == Z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }


    }
}
