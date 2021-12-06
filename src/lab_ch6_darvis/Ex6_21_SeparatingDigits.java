package lab_ch6_darvis;
import java.util.Scanner;
public class Ex6_21_SeparatingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        boolean block = true;
        System.out.println("Введите число от 1 до 99999");
        while (block != false) {
            num = sc.nextInt();
            if (num < 1 || num > 99999) {
                System.err.println("ОШИБКА");
                System.out.println("Введите число от 1 до 99999");
            } else {
                displayDigits(num);
                block=false;
            }
        }
    }

    public static int quotient(int a, int b) {
        return a / b;
    }

    public static int rem(int a, int b) {
        return a % b;
    }

    public static void displayDigits(int number) {
        String result = "";

        while (number != 0) {
            int rem = rem(number, 10);
            number = quotient(number, 10);
            result = rem + "  " + result;
        }

        System.out.println(result);
    }
}
