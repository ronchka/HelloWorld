import java.util.Scanner;


public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        String str = in.nextLine();
        System.out.println("Введите второе число: ");
        int num2 = in.nextInt();
        int num1 = Integer.parseInt(str);
        if (num1 > num2) {
            System.out.println(num1 + " - большее");
            System.out.println((double)num2 + " - меньшее");
        }
        else if (num2 > num1) {
            System.out.println(num2 + " - большее число");
            System.out.println((double)num1 + " - меньшее");
        }
    }
}
