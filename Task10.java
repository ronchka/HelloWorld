import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите i: ");
        int size_i = in.nextInt();
        System.out.println("Введите j: ");
        int size_j = in.nextInt();
        int array[][] = new int[size_i][size_j];
        System.out.println("Заполните массив числами: ");
        for (int i = 0; i < size_i; i++){
            for (int j = 0; j < size_j;  j++)
                array[i][j]= in.nextInt();
        }
        for (int i = 0; i == 0; i++){
            for (int j = 0; j < size_j;  j++)
                System.out.print(" " + array[i][j] * 3 + " ");
        }
}
}

