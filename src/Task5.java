import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число 1");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите число 2");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Введите оператор(+,-,*,/)");
        String c = reader.readLine();
        if (c.equals("+")) {
            System.out.println(a + b);
        } else if (c.equals("-")) {
            System.out.println(a - b);
        } else if (c.equals("*")) {
            System.out.println(a * b);
        } else if (c.equals("/") && b == 0) {
            System.out.println("На ноль делить нельзя");
        } else if (c.equals("/")) {
            System.out.println((double) a / (double) b);
        } else {
            System.out.println("Неверно указан оператор");
        }
        reader.close();
    }
}
