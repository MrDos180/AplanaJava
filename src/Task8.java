import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Введите положительное целое число");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int sum = 0;
        do {
            if(a%2!=0){
                sum+=a;
            }
            a++;
        } while (a<=n);
        System.out.println("Сумма всех нечетных чисел до числа "+n+" = "+sum);
    }
}
