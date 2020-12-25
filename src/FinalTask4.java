import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[] args) {
        System.out.println("Отгдадайте загадку:");
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("У вас есть  три попытки или одна с подсказкой. Для подсказки наберите “Подсказка” ");

        Scanner sc = new Scanner(System.in);
        String rightAnswer = "заархивированный вирус";
        String help = "подсказка";
        String hint = "Подсказка: сжатая вредная программа";
        int counter = 0;
        boolean helpUsed = false;
        String answer;
        do {
            System.out.print("Введите ответ: ");
            answer = sc.nextLine().toLowerCase();
            if (answer.equals(help)) {
                if (counter < 1) {
                    helpUsed = true;
                    System.out.println(hint);

                } else {
                    System.out.println("Подсказка уже недоступна");
                }

                System.out.print("Введите ответ: ");
                answer = sc.nextLine();
            }
            if (answer.equalsIgnoreCase(rightAnswer)) {
                System.out.println("Правильно!");
                helpUsed = true;
            } else if (answer.equalsIgnoreCase(help) && helpUsed) {
                System.out.println("Подсказка уже недоступна");
            } else if (counter < 2 && !helpUsed) {
                System.out.println("Подумай еще!");
            }
            counter++;
        }
        while (!helpUsed && counter < 3);

        if (!(answer.equalsIgnoreCase(rightAnswer))) {
            System.out.println("Обидно, приходи в другой раз");
        }
    }
}