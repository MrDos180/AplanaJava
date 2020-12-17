import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a = sc.nextInt();
        double[] array = new double[a];
        double sum = 0;
        for (int i = 0; i < a; i++) {
            System.out.println("Введите " + i + " элемент массива в формате n,n");
            array[i] = sc.nextDouble();
            sum += array[i];
        }
        double mid = sum / a;

        for (int i = 0; i < a; i++) {
            System.out.println(array[i] * mid);
        }
    }
}
