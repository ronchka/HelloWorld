import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x: ");
        float x = in.nextFloat();
        System.out.println("Введите y: ");
        float y = in.nextFloat();
        System.out.println("Введите один из символов ‘+’, ‘-’, ‘*’ или ‘/’: ");
        String s = in.next();
        float z = 0;
        switch (s) {
            case "+":
                z = x + y;
                break;
            case "-":
                z = x - y;
                break;
            case "*":
                z = x * y;
                break;
            case "/":
                z = x / y;
                break;
        }
        System.out.println(z);
    }
}
