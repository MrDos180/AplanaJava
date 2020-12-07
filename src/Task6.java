import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int answer1 = Integer.parseInt(reader.readLine());

        if (answer1 == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - пуд, 3 - английский фунт, 4 - унция");
        } else if (answer1 == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        } else {
            System.out.println("Выбран неверный ответ");
        }

        int answer2 = Integer.parseInt(reader.readLine());
        System.out.println("Введите количество выбранных единиц");
        int answer3 = Integer.parseInt(reader.readLine());

        System.out.println("Результат:");
        if (answer1 == 1) {
            switch (answer2) {
                case 1:
                    double kg = answer3;
                    double pood = answer3 * 0.061;
                    double un = answer3 * 35.27;
                    double lb = answer3 * 2.2;
                    System.out.println("Килограммы: " + kg);
                    System.out.println("Пуды: " + pood);
                    System.out.println("Фунты: " + lb);
                    System.out.println("Унции: " + un);
                    break;
                case 2:
                    kg = answer3 * 16.38;
                    pood = answer3;
                    lb = answer3 * 36.11;
                    un = answer3 * 577.79;
                    System.out.println("Килограммы: " + kg);
                    System.out.println("Пуды: " + pood);
                    System.out.println("Фунты: " + lb);
                    System.out.println("Унции: " + un);
                    break;
                case 3:
                    kg = answer3 * 0.45;
                    pood = answer3 * 0.028;
                    lb = answer3;
                    un = answer3 * 16;
                    System.out.println("Килограммы: " + kg);
                    System.out.println("Пуды: " + pood);
                    System.out.println("Фунты: " + lb);
                    System.out.println("Унции: " + un);
                    break;
                case 4:
                    kg = answer3 * 0.028;
                    pood = answer3 * 0.0017;
                    lb = answer3 * 0.063;
                    un = answer3;
                    System.out.println("Килограммы: " + kg);
                    System.out.println("Пуды: " + pood);
                    System.out.println("Фунты: " + lb);
                    System.out.println("Унции: " + un);
                    break;
            }
        } else {
            switch (answer2) {
                case 1:
                    double metre = answer3;
                    double mile = answer3 * 0.00062;
                    double yard = answer3 * 1.09;
                    double feet = answer3 * 3.281;
                    System.out.println("Метры: " + metre);
                    System.out.println("Мили: " + mile);
                    System.out.println("Ярды: " + yard);
                    System.out.println("Футы: " + feet);
                    break;
                case 2:
                    metre = answer3 * 1609.34;
                    mile = answer3;
                    yard = answer3 * 1760;
                    feet = answer3 * 5280;
                    System.out.println("Метры: " + metre);
                    System.out.println("Мили: " + mile);
                    System.out.println("Ярды: " + yard);
                    System.out.println("Футы: " + feet);
                    break;
                case 3:
                    metre = answer3 * 0.9144;
                    mile = answer3 * 0.00057;
                    yard = answer3;
                    feet = answer3 * 3;
                    System.out.println("Метры: " + metre);
                    System.out.println("Мили: " + mile);
                    System.out.println("Ярды: " + yard);
                    System.out.println("Футы: " + feet);
                    break;
                case 4:
                    metre = answer3 * 0.3048;
                    mile = answer3 * 0.00019;
                    yard = answer3 * 0.3333;
                    feet = answer3;
                    System.out.println("Метры: " + metre);
                    System.out.println("Мили: " + mile);
                    System.out.println("Ярды: " + yard);
                    System.out.println("Футы: " + feet);
                    break;
            }
        }
    }
}

