import java.util.Scanner;;

public class FinalTask4 {
    public static void main(String[] args) {
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ответ или слово \"Подсказка\": ");
        String turn1 = in.nextLine();
        if (turn1.equalsIgnoreCase("Заархивированный вирус")) {
            System.out.println("Правильно!");
        }
        else if (turn1.equalsIgnoreCase("Подсказка")) {
            System.out.println("Это как-то связано с вирусом");
            System.out.println("Введите ответ: ");
            String turn1Help = in.nextLine();
            if (turn1Help.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.println("Правильно!");
            } else {
                System.out.println("Обидно, приходи в другой раз");
            }
        }
        else {
            System.out.println("Подумай еще!");
            System.out.println("Введите ответ: ");
            String turn2 = in.nextLine();
            if (turn2.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.println("Правильно!");
            }
            else if (turn2.equalsIgnoreCase("Подсказка")) {
                System.out.println("Подсказка уже недоступна");
                System.out.println("Введите ответ: ");
                String turn2Help = in.nextLine();
                if (turn2Help.equalsIgnoreCase("Заархивированный вирус")) {
                    System.out.println("Правильно!");
                }
                else {
                    System.out.println("Подумай еще!");
                    System.out.println("Введите ответ: ");
                    String turn3 = in.nextLine();
                    if (turn3.equalsIgnoreCase("Заархивированный вирус")) {
                        System.out.println("Правильно!");
                    } else if (turn3.equalsIgnoreCase("Подсказка")) {
                        System.out.println("Подсказка уже недоступна");
                        System.out.println("Введите ответ: ");
                        String turn3Help = in.nextLine();
                        if (turn3Help.equalsIgnoreCase("Заархивированный вирус")) {
                            System.out.println("Правильно!");
                        } else {
                            System.out.println("Обидно, приходи в другой раз");
                        }
                    }
                }

            }
            else {
                System.out.println("Подумай еще!");
                System.out.println("Введите ответ: ");
                String turn4 = in.nextLine();
                if (turn4.equalsIgnoreCase("Заархивированный вирус")) {
                    System.out.println("Правильно!");
                } else if (turn4.equalsIgnoreCase("Подсказка")) {
                    System.out.println("Подсказка уже недоступна");
                    System.out.println("Введите ответ: ");
                    String turn4Help = in.nextLine();
                    if (turn4Help.equalsIgnoreCase("Заархивированный вирус")) {
                        System.out.println("Правильно!");
                    } else {
                        System.out.println("Обидно, приходи в другой раз");
                    }
                } else {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
        }
    }
}