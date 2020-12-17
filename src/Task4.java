import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        double mid = (double) (a + b + c) / 3;
        System.out.println(mid);
        double d = Math.floor(mid / 2);
        if (d > 3) {
            System.out.println("Программа выполнена корректно");
        }
        reader.close();
    }
}
