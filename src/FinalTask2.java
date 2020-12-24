import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите уравнение в формате ");
        String a = sc.nextLine();
        char firstNumber = a.charAt(0);
        char secondNumber = a.charAt(2);
        char thirdNumber = a.charAt(4);
        int result;

        String znak = String.valueOf(a.charAt(1));

        if (Character.isDigit(thirdNumber) && znak.equals("+") && Character.isDigit(firstNumber)) {
            result = Character.digit(thirdNumber, 10) - Character.digit(firstNumber, 10);
            System.out.println("x=" + result);
        } else if (Character.isDigit(thirdNumber) && znak.equals("+") && Character.isDigit(secondNumber)) {
            result = Character.digit(thirdNumber, 10) - Character.digit(secondNumber, 10);
            System.out.println("x=" + result);
        } else if (Character.isDigit(thirdNumber) && znak.equals("-") && Character.isDigit(firstNumber)) {
            result = Character.digit(firstNumber, 10) - Character.digit(thirdNumber, 10);
            System.out.println("x=" + result);
        } else if (Character.isDigit(thirdNumber) && znak.equals("-") && Character.isDigit(secondNumber)) {
            result = Character.digit(thirdNumber, 10) + Character.digit(secondNumber, 10);
            System.out.println("x=" + result);
        } else if (Character.isLetter(thirdNumber) && znak.equals("+") && Character.isDigit(firstNumber)) {
            result = Character.digit(secondNumber, 10) + Character.digit(firstNumber, 10);
            System.out.println("x=" + result);
        } else if (Character.isLetter(thirdNumber) && znak.equals("-") && Character.isDigit(firstNumber)) {
            result = Character.digit(firstNumber, 10) - Character.digit(secondNumber, 10);
            System.out.println("x=" + result);
        }


    }

}
