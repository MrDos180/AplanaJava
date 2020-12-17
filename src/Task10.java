import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количесво строк");
        int a = sc.nextInt();
        System.out.println("Введите количество столбцов");
        int b = sc.nextInt();
        int[][] array = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int q = 0; q < b; q++) {
                System.out.println("Введите [" + i + ", " + q + "] элемент матрицы");
                array[i][q] = sc.nextInt();
            }
        }

        for (int i = 0; i < b; i++) {
            System.out.println(array[0][i] * 3);
        }

    }
}
