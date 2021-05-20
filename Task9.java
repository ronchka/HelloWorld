import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        double array[] = new double[size];
        System.out.println("Заполните массив числами: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextDouble();
        }
        double sum = 0;
        double mid = 0;
        for (int i = 0; i < size; i++) {
            sum = sum +array[i];
        }
        mid = sum / size;
        System.out.println(mid);
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i] * mid + " ");
        }
    }
}
