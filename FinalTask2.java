import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите уравнение: ");
        String str = in.nextLine();
        char[] strToArray = str.toCharArray();
        /*for (int i = 0; i < strToArray.length; i++){
            System.out.print(strToArray[i] + " ");
        }*/
        int x = 0;
        if (strToArray[1] == '+') {
            if (strToArray[0] == 'x') {
                x = Character.getNumericValue(strToArray[4]) - Character.getNumericValue(strToArray[2]);
            } else if (strToArray[2] == 'x') {
                x = Character.getNumericValue(strToArray[4]) - Character.getNumericValue(strToArray[0]);
            } else if (strToArray[4] == 'x') {
                x = Character.getNumericValue(strToArray[2]) + Character.getNumericValue(strToArray[0]);
            }
        }
        else if (strToArray[1] == '-') {
            if (strToArray[0] == 'x') {
                x = Character.getNumericValue(strToArray[2]) + Character.getNumericValue(strToArray[4]);
            } else if (strToArray[2] == 'x') {
                x = Character.getNumericValue(strToArray[0]) - Character.getNumericValue(strToArray[4]);
            } else if (strToArray[4] == 'x') {
                x = Character.getNumericValue(strToArray[0]) - Character.getNumericValue(strToArray[2]);
            }
        }
        System.out.println("\nx=" + x);

    }
}

