import java.util.Scanner;
import java.util.regex.Pattern;

public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова через пробел");
        String[] array = sc.nextLine().split(" ");
        int len = array.length;
        int counter = 0;
        for (int i = 0; i < len; i++) {
            if (array[i].matches(".*[a-z,A-Z].*")) {
                System.out.print(array[i] + " ");
                counter++;
            }

        }
        System.out.println("\n" + "Количество слов на латинице= " + counter);
    }
}
