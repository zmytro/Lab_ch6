package lab_ch6_darvis;
import java.util.Scanner;
public class Ex6_17_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите целое число(0-выход): ");
        int num = 1;
        while (num != 0) {
            num = sc.nextInt();
            if(num == 0)break;
            if (isEven(num)) System.out.println(num + " -> чётное число");
            else System.out.println(num + " -> нечётное число");
        }
    }
    public static boolean isEven(int num) {
        return num % 2 == 0; //return (num % 2 == 0) ? true : false;
    }
}
