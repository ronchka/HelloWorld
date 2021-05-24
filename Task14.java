import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        for (int i=0; i <15; i++) {
            array[i] = random.nextInt(21) - random.nextInt(21);
            System.out.print(array[i] + " "); // вывела на экран массив для проверки
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0; i <15; i++) {
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);
        }
        System.out.printf("\nМаксимальный элемент массива:" + max);
        System.out.printf("\nМинимальный элемент массива:" + min);
        if (Math.abs(max) > Math.abs(min)){
            System.out.printf("\n" + Math.abs(max));
        }
        else if (Math.abs(max) < Math.abs(min)){
            System.out.printf("\n" + Math.abs(min));
        }
    }
}
