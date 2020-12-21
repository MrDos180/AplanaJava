import java.util.Random;

public class Test14 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        int min = -20;
        int max = 20;
        int diff = max - min;

        for (int i = 0; i < 15; i++) {
            array[i] = random.nextInt(diff + 1) + min;
        }
        int maxArray = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxArray) {
                maxArray = array[i];
            }

        }
        int minArray = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minArray) {
                minArray = array[i];
            }
        }
        System.out.println("Максимальный элемент массива: " + maxArray);
        System.out.println("Минимальный элемент массива: " + minArray);

        int mod = Math.max(Math.abs(maxArray), Math.abs(minArray));
        System.out.println("Наибольший по модулю: " + mod);
    }
}
