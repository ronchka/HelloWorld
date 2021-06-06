import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinalTask3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число строк: ");
        int n = in.nextInt();
        int[] count = new int[n];
        String[] str = new String[n];
        System.out.println("Введите строки: ");
        for (int i = 0; i < n; i++) {
            str[i] = reader.readLine();
            String myString = "";
            for (int j = 0 ; j < str[i].length() ; j++){
                int bukva = str[i].indexOf(str[i].charAt(j));
                if (bukva == j) {
                    myString = myString + str[i].charAt(j);
                    }
                }
                count[i] = myString.length();
            }
        int max = 0;
        int povtor = 0;
        for (int i = 1 ; i < n ; i++){
            if (count[max] < count[i]){
                max = i;
            }
            else if (count[max] == count[i]){
                povtor++;
            }
            }
        if(povtor < 2){
            System.out.println("Ответ: " + str[max]);
        }
        else {
            System.out.println("Ответ: " + str[0]);
        }
    }
}

