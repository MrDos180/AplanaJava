import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int a = sc.nextInt();
        String[] array = new String[a];
        String temp = null;
        char[] books = new char[30];
        Set<Character> set = new HashSet<>();
        int max1 = 0;
        int max2 = 0;
        int count = 0;

        for (int i = 0; i < a; i++) {
            array[i] = sc.next();
            temp = array[i].toLowerCase();
            for (int j = 0; j < temp.length(); j++) {
                books[j] = temp.charAt(j);
                if (set.add(books[j])) {
                    max1++;
                }
            }
            if (max1 >= max2) {
                max2 = max1;
                count++;
            }
            set.clear();
            max1 = 0;
        }
        System.out.println("Строка с максимальным количеством различных символов: " + array[count - 1]);
    }
}