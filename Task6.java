import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int x = in.nextInt();
        if (x == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int y = in.nextInt();
            System.out.println("Введите число");
            float z = in.nextFloat();
            if (y == 1) {
                System.out.printf("Метры: %.3f\n", z);
                System.out.printf("Мили: %.3f\n", z * 0.0006);
                System.out.printf("Ярды: %.3f\n", z * 1.0936);
                System.out.printf("Футы: %.3f\n", z * 3.2808);
            } else if (y == 2) {
                System.out.printf("Мили: %.3f\n", z);
                System.out.printf("Метры: %.3f\n", z / 0.0006);
                System.out.printf("Ярды: %.3f\n", z / 0.0006 * 1.0936);
                System.out.printf("Футы: %.3f\n", z / 0.0006 * 3.2808);
            } else if (y == 3) {
                System.out.printf("Ярды: %.3f\n", z);
                System.out.printf("Метры: %.3f\n", z / 1.0936);
                System.out.printf("Мили: %.3f\n", z / 1.0936 * 0.0006);
                System.out.printf("Футы: %.3f\n", z / 1.0936 * 3.2808);
            } else if (y == 4) {
                System.out.printf("Футы: %.3f\n", z);
                System.out.printf("Метры: %.3f\n", z / 3.2808);
                System.out.printf("Мили: %.3f\n", z / 3.2808 * 0.0006);
                System.out.printf("Ярды: %.3f\n", z / 3.2808 * 1.0936);
            }
        }
        else if (x == 1) {
                System.out.println("Выберите единицу измерения: 1 - килограмм,  2 - фунт, 3 - унция");
                float y = in.nextFloat();
                System.out.println("Введите число");
                float z = in.nextFloat();
                if (y == 1) {
                    System.out.printf("Килограммы: %.3f\n", z);
                    System.out.printf("Фунты: %.3f\n", z * 2.2046);
                    System.out.printf("Унции: %.3f\n", z * 35.274);
                }
                else if (y == 2) {
                    System.out.printf("Фунты: %.3f\n", z);
                    System.out.printf("Килограммы: %.3f\n", z / 2.2046);
                    System.out.printf("Унции: %.3f\n", z / 2.2046 * 35.274);
                }
                else if (y == 3) {
                    System.out.printf("Унции: %.3f\n", z);
                    System.out.printf("Килограммы: %.3f\n", z / 35.274);
                    System.out.printf("Фунты: %.3f\n", z / 35.274 * 2.2046);
                }


        }

    }
}
