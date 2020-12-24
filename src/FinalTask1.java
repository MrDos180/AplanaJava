import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите курс доллара");
        double dollar= sc.nextDouble();
        System.out.println("Введите количество рублей");
        double ruble = sc.nextDouble();
        System.out.printf("Итого %.2f %n", dollar*ruble);
    }
}
