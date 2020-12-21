import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        String a = sc.nextLine();
        System.out.println("Введите второе число");
        Integer b = sc.nextInt();
        int a1 = Integer.parseInt(a);
        int compare;
        compare = b.compareTo(a1);
        if (compare > 0) {
            System.out.println("Большое число " + b);
            System.out.println("Меньшое число " + (double) a1);
        } else if (compare < 0) {
            System.out.println("Большое число " + a1);
            System.out.println("Меньшое число " + (double) b);
        } else {
            System.out.println("Оба числа равны");
        }

    }
}
