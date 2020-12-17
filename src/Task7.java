import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a = sc.nextInt();
        int[] array = new int[a];
        int x = 2;
        int y = 3;
        int z = 4;
        for (int i = 0; i < a; i++) {
            System.out.println("Введите " + i + " элемент массива");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < a; i++) {
            if (array[i] == x | array[i] == y | array[i] == z) {
                System.out.println("Данное значение имеется в константах");
            }
        }
    }

}

