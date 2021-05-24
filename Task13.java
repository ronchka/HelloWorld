import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку из слов, разделенных пробелами: ");
        String str = in.nextLine();
        String[] words = str.split(" ");
        int count = 0;
        for (String word : words){
            if (word.matches("[a-zA-Z]+") == true) {
                System.out.print(word + " ");
                count = count + 1;
            }
        }
        System.out.printf("%n%d", count);
    }
}
