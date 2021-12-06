package lab_ch6_darvis;

import java.util.Scanner;

public class Ex6_26_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = sc.nextInt();
        System.out.printf("%.0f",reverse(num));
    }

    public static double reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10;
            rev = rev + num % 10;
            num = num / 10;
        }
        return rev;
    }
}

